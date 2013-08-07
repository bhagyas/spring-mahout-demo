package com.intera.shoprecommender.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.mahout.cf.taste.impl.common.FastByIDMap;
import org.apache.mahout.cf.taste.impl.model.GenericDataModel;
import org.apache.mahout.cf.taste.impl.model.GenericUserPreferenceArray;
import org.apache.mahout.cf.taste.impl.recommender.CachingRecommender;
import org.apache.mahout.cf.taste.impl.recommender.slopeone.SlopeOneRecommender;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.model.PreferenceArray;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;

import com.intera.shoprecommender.Item;
import com.intera.shoprecommender.Purchase;
import com.intera.shoprecommender.Shopper;

public class ItemRecommenderServiceImpl implements ItemRecommenderService {

	@Override
	public List<Item> getRecommendedItemsForShopper(Shopper shopper)
			throws Exception {

		List<Item> items = new ArrayList<Item>();

		DataModel model = new GenericDataModel(getUserData());

		// create a simple recommender on our data
		CachingRecommender cachingRecommender = new CachingRecommender(new SlopeOneRecommender(model));

		List<RecommendedItem> recommend = cachingRecommender.recommend(shopper.getId(), 10); //upto 10 recommendations
		
		for (RecommendedItem recommendedItem : recommend) {
			items.add(Item.findItem(recommendedItem.getItemID()));
		}
		
		return items;
	}

	/**
	 * Returns user data for recommendations
	 * NOTE: This should not be used as production code.
	 * @return
	 */
	private FastByIDMap<PreferenceArray> getUserData() {
		FastByIDMap<PreferenceArray> preferences = new FastByIDMap<PreferenceArray>();

		for (Shopper shopper : Shopper.findAllShoppers()) {
			PreferenceArray userPreferences = new GenericUserPreferenceArray(10);

			int i = 0;
			for (Purchase purchase : Purchase.findPurchasesByPurchaser(shopper)
					.getResultList()) {
				for (Item purchasedItem : purchase.getItems()) {
					userPreferences.setUserID(i, purchase.getPurchaser().getId());
					userPreferences.setItemID(i, purchasedItem.getId());
					userPreferences.setValue(i, 1); // set the value to 1, assuming order is not considered
					i++;
				}
			}
			preferences.put(shopper.getId(), userPreferences);
		}

		return preferences;
	}

}
