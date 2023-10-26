package com.example.demo.Entities;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public List<Thing> items = new ArrayList<>();
    public void addToStore(Thing item){
        items.add(0, item);
    }
    public List<Thing> findInStore(Filter filter){
        List<Thing> match  = new ArrayList<>();
        for (Thing item : items) {
            if (filter.match(item)){
                match.add(item);
            }
          }
          return match;

    }
}
