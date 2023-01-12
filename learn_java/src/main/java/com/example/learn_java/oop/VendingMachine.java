package com.example.learn_java.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VendingMachine {
    private VendingMachineFunc vendingMachineFunc;
    private Thing[][] stocks;


    public VendingMachine(VendingMachineFunc vendingMachineFunc) {
        this.vendingMachineFunc = vendingMachineFunc;
    }

    public Thing[][] getStocks() {
        return stocks;
    }

    public void fillingMachine() {
        stocks = vendingMachineFunc.fillingMachine(this);
    }


}
