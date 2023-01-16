package com.example.learn_java.oop;

import java.util.ArrayList;
import java.util.Collections;

public class ManyWays implements Payments{
    private ArrayList<String> ways = new ArrayList<>();

    public ManyWays(ArrayList<String> ways) {
        this.ways.addAll(ways);
    }

    @Override
    public ArrayList<String> paymentMethod(VendingMachine vendingMachine) {
        return ways;
    }


}
