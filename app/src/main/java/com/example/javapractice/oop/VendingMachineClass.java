package com.example.javapractice.oop;

import com.example.javapractice.oop.dto.BeverageDto;

public class VendingMachineClass implements VendingMachine {
    Object[][] things;


    public static void main(String[] args) {
        VendingMachineClass vendingMachine = new VendingMachineClass();

    }


    @Override
    public void fillingMachine(Object[][] things) {
        this.things = things;
        if (things[0][0] instanceof BeverageDto) {
            System.out.println("음료수" );
        }

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
