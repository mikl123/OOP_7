package com.example.demo.Entities;

import java.util.ArrayList;
import java.util.List;

import lombok.NoArgsConstructor;
@NoArgsConstructor
public class FlowerBucket {
    private List<FlowerPack> packs = new ArrayList<>();

    public void addFlowerPack(FlowerPack pack) {
        packs.add(pack);
    }

    public double getPrice() {
        double sum = 0;
        for (int i = 0; i < packs.size(); i++) {
            sum+=packs.get(i).getPrice();
        }
        return sum;
    }
}
