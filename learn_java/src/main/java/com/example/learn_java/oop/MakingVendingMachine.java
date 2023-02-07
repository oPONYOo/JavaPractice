package com.example.learn_java.oop;

import com.example.learn_java.oop.fuction.VendingMachineFunc;

public abstract class MakingVendingMachine implements VendingMachineFunc {
    @Override
    public Thing[][] fillingMachine(VendingMachine vendingMachine) {
        return setCount();
    }


}
