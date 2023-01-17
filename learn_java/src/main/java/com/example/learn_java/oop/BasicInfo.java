package com.example.learn_java.oop;

import java.text.DecimalFormat;
import java.util.Objects;

public class BasicInfo implements Info { //일반적인 완제품 정보
    private String name;
    private int price;

    public BasicInfo(String name, int price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public int showInfo(Info info) {
        System.out.println("info" + info);
        return price;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###,###");
        String money = df.format(price);
        return "BasicInfo{" +
                "name='" + name + '\'' +
                ", price=" + money +
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
