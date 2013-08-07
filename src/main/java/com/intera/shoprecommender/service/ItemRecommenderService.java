package com.intera.shoprecommender.service;

import java.util.List;

import com.intera.shoprecommender.Item;
import com.intera.shoprecommender.Shopper;

public interface ItemRecommenderService {

	/**
	 * Returns a list of recommended items for a shopper
	 * @param shopper
	 * @return
	 */
	List<Item> getRecommendedItemsForShopper(Shopper shopper);

}
