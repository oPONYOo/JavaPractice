package com.example.learn_java.oop;

import java.util.Objects;

public class BasicInfo implements Info {
    private String name;
    private Integer price;

    public BasicInfo(String name, Integer price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public void showInfo() {
        System.out.println("name" + name);
        System.out.println("name" + price);
    }

    @Override
    public String toString() {
        return "BasicInfo{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicInfo basicInfo = (BasicInfo) o;
        return Objects.equals(name, basicInfo.name) && Objects.equals(price, basicInfo.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
