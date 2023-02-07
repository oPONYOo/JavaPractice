package com.example.learn_java.oop;

import com.example.learn_java.oop.fuction.Info;

import java.util.Objects;

public class Thing {
    private Info info;


    public Thing(Info info) {
        this.info = info;
    }

    public String getInfo() {
        return info.toString();
    }

    public int getPrice() {
       return info.showPrice();
    }

    public String getTemp() {
        return info.showTemperature();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Objects.equals(info, thing.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(info);
    }

    @Override
    public String toString() {
        return "Thing{" +
                "info=" + info +
                '}';
    }
}
