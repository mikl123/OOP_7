package com.example.demo.Entities;


import lombok.Getter;


@Getter
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public FlowerPack(Flower flower) {
        this.flower = new Flower(flower);
        this.quantity = 1;
    }
    public FlowerPack(Flower flower,int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
    }
    public double getPrice() {
        return flower.getPrice() * quantity;
    }
    public void setQuantity(int quantity) {
        if (quantity < 1) {
            this.quantity = 1;
            return;
        }
        if (quantity>=20){
            this.quantity = 20;
            return;
        }
        this.quantity = quantity;
    }
}
