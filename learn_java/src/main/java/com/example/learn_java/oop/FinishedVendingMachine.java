package com.example.learn_java.oop;

import com.example.learn_java.oop.fuction.VendingMachineFunc;

public abstract class FinishedVendingMachine implements VendingMachineFunc { //완제품 자판기


    @Override
    public Thing[][] fillingMachine(VendingMachine vendingMachine) {
        return setCount();
    }



}
