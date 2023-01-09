package com.example.javapractice.oop;

public interface VendingMachine {
    void fillingMachine(Object[][] objects);

    void choiceThing(Object obj);

    void showPrice(int money);

    int calculateMoney(int money);

    Object giveThing(Object obj);

    int giveChange();


}
