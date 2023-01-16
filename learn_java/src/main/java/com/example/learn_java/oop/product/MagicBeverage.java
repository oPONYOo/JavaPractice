package com.example.learn_java.oop.product;

import com.example.learn_java.oop.BasicInfo;
import com.example.learn_java.oop.FinishedVendingMachine;
import com.example.learn_java.oop.ManyWays;
import com.example.learn_java.oop.Thing;
import com.example.learn_java.oop.VendingMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MagicBeverage extends FinishedVendingMachine {
    private final Integer button;
    private final Integer count;

    public static void main(String[] args) {
        // 버튼 3개, 수량 10개씩, 현금, 카드 결제 가능

        ArrayList<String> ways = new ArrayList<>(Arrays.asList("CASH", "CARD"));
        VendingMachine vendingMachine = new VendingMachine(new MagicBeverage(3, 3), new ManyWays(ways));
        vendingMachine.fillingMachine();
        vendingMachine.setPayments();


        // 결제 방식 선택 및 동작
        vendingMachine.pressPaymentButton(2);


        System.out.println(Arrays.deepToString(vendingMachine.getStocks()));
    }

    public MagicBeverage(int button, int count) {
        this.button = button;
        this.count = count;
    }



    private Thing randomBeverageCategory() {
        Thing coke = new Thing(new BasicInfo("펩시", 1000));
        Thing water = new Thing(new BasicInfo("물", 700));
        Thing sprite = new Thing(new BasicInfo("스프라이트", 1200));
        Thing[] categoryList = {coke, water, sprite};
        int min = 0;
        int max = categoryList.length;

        Random random = new Random();
        int value = random.nextInt(max + min) + min;
        return categoryList[value];
    }

    @Override
    public Thing[][] setCount() {
        System.out.println("setCount");
        Thing[][] beverageArray = new Thing[button][count];

        for (int i = 0; i < button; i++) {
            for (int j = 0; j < count; j++) {
                beverageArray[i][j] = randomBeverageCategory();
            }
        }
        return beverageArray;
    }



}
