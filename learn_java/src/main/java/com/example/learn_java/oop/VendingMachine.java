package com.example.learn_java.oop;


import com.example.learn_java.oop.fuction.Payments;
import com.example.learn_java.oop.fuction.VendingMachineFunc;

import java.util.ArrayList;
import java.util.Objects;


public class VendingMachine  {
    private final VendingMachineFunc vendingMachineFunc;
    private final Payments payments;
    private Thing[][] stocks;
    public String paymentMethod;
    public int cash;


    public VendingMachine(VendingMachineFunc vendingMachineFunc, Payments payments) {
        this.vendingMachineFunc = vendingMachineFunc;
        this.payments = payments;
    }

    public Thing[][] getStocks() {
        return stocks;
    }

    public Boolean fillingMachine() {
        System.out.println("Additional1 "+ vendingMachineFunc.setTemp());
        System.out.println("Additional2 "+ vendingMachineFunc.setRobot());
        Thing[][] checkStocks = vendingMachineFunc.fillingMachine(this);
        for (Thing[] checkStock : checkStocks) {
            for (int j = 0; j < checkStocks[0].length; j++) {
                if (!Objects.equals(checkStock[j].getTemp(), vendingMachineFunc.setTemp())) {
                    System.out.println("상품이 조건에 부합하지 않습니다. " + checkStock[j].getInfo());
                    return false;
                }
            }
        }
        stocks = vendingMachineFunc.fillingMachine(this);
        return true;
    }

    public void setPayments() { // 자판기 결제 방식 종류 세팅
        ArrayList<String> paymentMethodList = payments.paymentMethod(this);
        System.out.println("paymentsWay" + paymentMethodList);
    }

    public void pressPaymentButton(Integer payment) { // 사용자가 결제 방식 선택

        switch (payment) {
            case 1:
                paymentMethod = "CASH";
                System.out.println("돈을 투입구에 넣어주세요.");
                break;
            case 2:
                paymentMethod = "CARD";
                System.out.println("카드를 투입구에 넣어주세요.");
                break;
            case 3:
                paymentMethod = "QRCODE";
                System.out.println("");
                break;
            default:
                paymentMethod = "CASH";
        }
        System.out.println("결제 방식:" + paymentMethod);

    }

    public void insertCash(int cash) {
        this.cash = cash;


    }

    public void insertCard(Boolean card) {
        if (card) {
            //
        } else {
            System.out.println("다른 카드를 넣어주세요.");
//            pressPaymentButton(2);
            //다른 카드 넣거나 다른 결제 방식이 있다면 선택하기
        }
    }

    public void pressThingButton(int num) {
        //1. 재고 있는지 확인
        //2. 지불한 현금, 혹은 카드로 계산이 가능한지 확인
        if (stocks[num].length == 0) {
            System.out.println("해당 상품은 품절입니다. 다른 상품을 선택해주세요.");
            this.pressPaymentButton(1); //nextInt()
        }


        int price = stocks[num][0].getPrice();
        System.out.println("선택한 상품은 " + price + "원입니다.");


        switch (paymentMethod) {
            case "CARD":
            case "QRCODE":
                elseFlow();
                break;
            default:
                cashFlow(price);
        }

    }

    public void cashFlow(int price) {
        if (price <= cash) { // 현금결제인 경우
            cash -= price;
            //재고에서 선택한 상품 없애기
            System.out.println("구매가 완료되었습니다. 아래에서 가져가세요.");

        } else {
            System.out.println("잔액이 부족합니다. 다른 상품을 선택해주세요.");
        }
        System.out.println("현재 남아있는 잔액은 " + cash + "입니다.");
    }

    public void elseFlow() {

    }

}
