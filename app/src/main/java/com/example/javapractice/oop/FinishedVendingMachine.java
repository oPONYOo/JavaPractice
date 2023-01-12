package com.example.javapractice.oop;

public abstract class FinishedVendingMachine implements VendingMachineFunc { //완제품 자판기


    @Override
    public Thing[][] fillingMachine(VendingMachine vendingMachine) {
        return setCount();
    }

    abstract protected Thing[][] setCount();
}
