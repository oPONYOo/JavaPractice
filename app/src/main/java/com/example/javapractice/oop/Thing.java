package com.example.javapractice.oop;

public class Thing {
    private Info info;


    public Thing(Info info) {
        this.info = info;
    }

    public void showInfo() {
        info.showInfo();
    }

}
