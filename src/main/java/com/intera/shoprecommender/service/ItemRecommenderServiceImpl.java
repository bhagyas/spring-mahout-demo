package com.intera.shoprecommender.service;

import java.util.List;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

import com.intera.shoprecommender.Item;
import com.intera.shoprecommender.Shopper;

public class ItemRecommenderServiceImpl implements ItemRecommenderService {

	@Override
	public List<Item> getRecommendedItemsForShopper(Shopper shopper) {

		DataModel model = new FileDataModel(dataFile);

		// TODO Auto-generated method stub
		return null;
	}

}
