package com.example.javapractice.oop;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private VendingMachineFunc vendingMachineFunc;
    private List<Thing> things = new ArrayList<>();


    public VendingMachine(VendingMachineFunc vendingMachineFunc) {
        this.vendingMachineFunc = vendingMachineFunc;
    }

    public List<Thing> getThings() {
        return things;
    }

    public Thing[][] fillingMachine() {
        return vendingMachineFunc.fillingMachine(this);
    }



}
