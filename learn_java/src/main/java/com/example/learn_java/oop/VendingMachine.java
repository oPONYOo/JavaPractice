package com.example.learn_java.oop;


import java.util.ArrayList;

public class VendingMachine {
    private VendingMachineFunc vendingMachineFunc;
    private Payments payments;
    private Thing[][] stocks;
    private ArrayList<String> paymentMethodList;
    private String paymentMethod;


    public VendingMachine(VendingMachineFunc vendingMachineFunc, Payments payments) {
        this.vendingMachineFunc = vendingMachineFunc;
        this.payments = payments;
    }

    public Thing[][] getStocks() {
        return stocks;
    }

    public void fillingMachine() {
        stocks = vendingMachineFunc.fillingMachine(this);
    }

    public void setPayments() { // 자판기 결제 방식 종류 세팅
        paymentMethodList = payments.paymentMethod(this);
        System.out.println("paymentsWay" + paymentMethodList);
    }

    public void pressPaymentButton(Integer payment) { // 지불 방식 선택

        switch (payment) {
            case 1: paymentMethod = "CASH";
            case 2: paymentMethod = "CARD";
            case 3: paymentMethod = "QRCODE";
            default: paymentMethod = "CASH";
        }
        System.out.println("결제 방식 선택" + payment);

    }


}
