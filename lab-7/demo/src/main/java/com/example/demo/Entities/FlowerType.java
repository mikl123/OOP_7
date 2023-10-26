package com.example.demo.Entities;

public enum FlowerType {
    CHAMOMILE(30,6,FlowerColor.WHITE),
    ROSE(50,8,FlowerColor.RED),
    TULIP(40,10,FlowerColor.BLUE);
    public int sepal_length;
    public FlowerColor color;
    public int price;
    private FlowerType(int price, int sepal_length, FlowerColor color){
        this.sepal_length = sepal_length;
        this.color = color;
        this.price = price;
    }
}
