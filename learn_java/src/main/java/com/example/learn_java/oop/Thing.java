package com.example.learn_java.oop;

import java.text.DecimalFormat;
import java.util.Objects;

public class Thing {
    private Info info;


    public Thing(Info info) {
        this.info = info;
    }

    public int showInfo() {
       return info.showInfo(info);
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
