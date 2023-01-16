package com.example.learn_java.oop;

public abstract class MakingVendingMachine implements VendingMachineFunc {
    @Override
    public Thing[][] fillingMachine(VendingMachine vendingMachine) {
        return setCount();
    }


}
