package com.example.learn_java.oop;

public abstract class FinishedVendingMachine implements VendingMachineFunc { //완제품 자판기


    @Override
    public Thing[][] fillingMachine(VendingMachine vendingMachine) {
        return setCount();
    }



}
