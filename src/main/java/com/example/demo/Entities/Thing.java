package com.example.demo.Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
public class Thing {
    @Getter
    @Setter
    private double price;
    public Thing(int price) {
        this.price = price;
    }
}
