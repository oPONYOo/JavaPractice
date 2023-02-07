package com.example.learn_java.oop.fuction;

import com.example.learn_java.oop.Thing;
import com.example.learn_java.oop.VendingMachine;

public interface VendingMachineFunc {
    Thing[][] fillingMachine(VendingMachine vendingMachine);
    Thing[][] setCount();

    String setTemp();
    String setRobot();

}
