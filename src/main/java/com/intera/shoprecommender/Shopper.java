package com.intera.shoprecommender;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

import com.intera.shoprecommender.service.ItemRecommenderService;
import com.intera.shoprecommender.service.ItemRecommenderServiceImpl;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Shopper {

	@NotEmpty
	String username;

	/**
	 * Returns a list of recommended items for a shopper
	 * 
	 * @return
	 * @throws Exception 
	 */
	public List<Item> getRecommendedItems() throws Exception {
		ItemRecommenderService recommender = new ItemRecommenderServiceImpl();
		return recommender.getRecommendedItemsForShopper(this);
	}

}
