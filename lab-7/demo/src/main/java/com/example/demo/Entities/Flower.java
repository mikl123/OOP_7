package com.example.demo.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @NoArgsConstructor
public class Flower extends Thing {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private FlowerType flowerType;

    public Flower(FlowerType flowerType){
        setPrice(flowerType.price);
        this.flowerType = flowerType;
        this.sepalLength = flowerType.sepal_length;
        this.color = flowerType.color;
    }
    public Flower(Flower flower){
        this.sepalLength = flower.sepalLength;
        this.color = flower.color;
        setPrice(flower.getPrice());
        this.flowerType = flower.flowerType;
    }
    public String toString(){
        return flowerType.toString();
    }
    public String getColor() {
        return color.toString();
    }
}
