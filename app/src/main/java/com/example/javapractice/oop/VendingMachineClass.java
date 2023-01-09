package com.example.javapractice.oop;

import java.util.Arrays;

public class VendingMachineClass implements VendingMachine {


    public static void main(String[] args) {
        VendingMachineClass vendingMachine = new VendingMachineClass();

    }


    @Override
    public void fillingMachine(Object[][] objects) {
        System.out.println(Arrays.deepToString(objects));
    }

    @Override
    public void choiceThing(Object obj) {
        System.out.println("Choice " + obj);
    }

    @Override
    public void showPrice(int money) {

    }

    @Override
    public int calculateMoney(int money) {
        return 0;
    }

    @Override
    public Object giveThing(Object obj) {
        return null;
    }

    @Override
    public int giveChange() {
        return 0;
    }
}
