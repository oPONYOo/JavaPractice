package com.example.javapractice.oop;

public  class BasicInfo implements Info {
    private String name;
    private Integer price;

    public BasicInfo(String name, Integer price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public void showInfo() {
        System.out.println("name"+name);
        System.out.println("name"+price);
    }
}
