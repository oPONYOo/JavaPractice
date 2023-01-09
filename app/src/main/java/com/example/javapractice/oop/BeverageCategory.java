package com.example.javapractice.oop;

import com.example.javapractice.oop.dto.BeverageDto;

public enum BeverageCategory {
    PEPSI(new BeverageDto(1000, "콜라")),
    WATER(new BeverageDto(700, "물")),
    SPRITE(new BeverageDto(1100, "사이다"));

    private final BeverageDto beverage;
    BeverageCategory(BeverageDto beverage) {
        this.beverage = beverage;
    }

    public BeverageDto getBeverage() {
        return beverage;
    }
}
