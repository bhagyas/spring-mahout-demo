package com.intera.shoprecommender;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Purchase {

    @ManyToOne
    private Shopper purchaser;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Item> items = new HashSet<Item>();
}
