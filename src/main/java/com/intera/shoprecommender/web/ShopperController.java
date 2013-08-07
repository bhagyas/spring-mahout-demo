package com.intera.shoprecommender.web;

import com.intera.shoprecommender.Shopper;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/shoppers")
@Controller
@RooWebScaffold(path = "shoppers", formBackingObject = Shopper.class)
public class ShopperController {
}
