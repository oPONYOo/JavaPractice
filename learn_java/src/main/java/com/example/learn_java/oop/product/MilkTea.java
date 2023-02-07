package com.example.learn_java.oop.product;

import com.example.learn_java.oop.BasicInfo;
import com.example.learn_java.oop.fuction.Ice;
import com.example.learn_java.oop.MakingVendingMachine;
import com.example.learn_java.oop.ManyWays;
import com.example.learn_java.oop.fuction.OptionalSomething;
import com.example.learn_java.oop.Thing;
import com.example.learn_java.oop.VendingMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MilkTea extends MakingVendingMachine implements OptionalSomething, Ice {
    private final Integer button;
    private final Integer count;
    private Thing[][] milkTeaArray;

    @Override
    public Boolean setIce() {
        return true;
    }


    @Override
    public String setTemp() {
        if (setIce()) return "ICE";
        else return "HOT";
    }

    @Override
    public Boolean setRobotArm() {
        return true;
    }

    @Override
    public String setRobot() {
        if (setRobotArm()) return "RobotArm";
        else return "Nothing";
    }

    public static void main(String[] args) {
        // 버튼 3개, 수량 10개씩, 현금, 카드 결제 가능

        ArrayList<String> ways = new ArrayList<>(Arrays.asList("CASH", "CARD"));
        MilkTea milkTea = new MilkTea(3, 3);
        VendingMachine vendingMachine = new VendingMachine(milkTea,
                new ManyWays(ways));

        if (vendingMachine.fillingMachine()) {
            System.out.println(Arrays.deepToString(vendingMachine.getStocks()));

            vendingMachine.setPayments();


            // 결제 방식 선택 및 동작(카드, 현금만 가능 1,2)
            int cash = 1;
            int card = 2;
            boolean cardAvailable = true;
            vendingMachine.pressPaymentButton(card); //nextInt()로 처리하면 좋을듯
            if (Objects.equals(vendingMachine.paymentMethod, "CARD")) {
                vendingMachine.insertCard(cardAvailable);
            } else {
                vendingMachine.insertCash(5000);
            }

            //자판기 버튼 누르기기
            vendingMachine.pressThingButton(0); //nextInt()
        }


    }

    public MilkTea(int button, int count) {
        this.button = button;
        this.count = count;
    }

    private Thing milkTeaCategory(int idx) {
        Thing black = new Thing(new BasicInfo("black", 5000, setTemp()));
        Thing taro = new Thing(new BasicInfo("taro", 4000, setTemp()));
        Thing greenTea = new Thing(new BasicInfo("greenTea", 6000, setTemp()));

        switch (idx) {
            case 0:
                return black;
            case 1:
                return taro;
            case 2:
                return greenTea;
        }

        return black;
    }


    @Override
    public Thing[][] setCount() {
        System.out.println("setCount");
        milkTeaArray = new Thing[button][count];

        for (int i = 0; i < button; i++) {
            for (int j = 0; j < count; j++) {
                milkTeaArray[i][j] = milkTeaCategory(i);
            }
        }
        return milkTeaArray;
    }


}
