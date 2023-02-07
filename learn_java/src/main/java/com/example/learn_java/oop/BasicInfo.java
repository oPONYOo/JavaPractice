package com.example.learn_java.oop;

import com.example.learn_java.oop.fuction.Info;

import java.util.Objects;

public class BasicInfo implements Info {
    private final String name;
    private final Integer price;
    private String temperature;

    public BasicInfo(String name, Integer price) { //일반적인 완제품 정보
        this.name = name;
        this.price = price;
    }

    public BasicInfo(String name, Integer price, String temperature) {
        this.name = name;
        this.price = price;
        this.temperature = temperature;
    }


    @Override
    public int showPrice() {
        return price;
    }

    @Override
    public String showTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "BasicInfo{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", temperature='" + temperature + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicInfo basicInfo = (BasicInfo) o;
        return price == basicInfo.price && Objects.equals(name, basicInfo.name) && Objects.equals(temperature, basicInfo.temperature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
