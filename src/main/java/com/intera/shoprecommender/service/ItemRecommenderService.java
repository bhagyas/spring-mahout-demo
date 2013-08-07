package com.intera.shoprecommender.service;

import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;

import com.intera.shoprecommender.Item;
import com.intera.shoprecommender.Shopper;

public interface ItemRecommenderService {

	/**
	 * Returns a list of recommended items for a shopper
	 * @param shopper
	 * @return
	 * @throws TasteException 
	 * @throws Exception 
	 */
	List<Item> getRecommendedItemsForShopper(Shopper shopper) throws Exception;

}
