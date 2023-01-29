package com.example.learn_java.oop.product;

import com.example.learn_java.oop.BasicInfo;
import com.example.learn_java.oop.MakingVendingMachine;
import com.example.learn_java.oop.ManyWays;
import com.example.learn_java.oop.Thing;
import com.example.learn_java.oop.VendingMachine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MilkTea extends MakingVendingMachine {
    private final Integer button;
    private final Integer count;
    private Thing[][] milkTeaArray;

    public static void main(String[] args) {
        // 버튼 3개, 수량 10개씩, 현금, 카드 결제 가능

        ArrayList<String> ways = new ArrayList<>(Arrays.asList("CASH", "CARD"));
        VendingMachine vendingMachine = new VendingMachine(new MilkTea(3, 3), new ManyWays(ways), "ICE");
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
            } else  {
                vendingMachine.insertCash(5000);
            }

            //자판기 버튼 누르기기
            vendingMachine.pressThingButton(1); //nextInt()
        }


    }

    public MilkTea(int button, int count) {
        this.button = button;
        this.count = count;
    }




    // 면에 뜨거운 물을 붓는다, 물을 버린다, 국물을 붓는다, 차슈를 올린다.



    private Thing milkTeaCategory() {
        Thing black = new Thing(new BasicInfo("black", 5000, "HOT"));
        Thing taro = new Thing(new BasicInfo("taro", 4000, "ICE"));
        Thing greenTea = new Thing(new BasicInfo("greenTea", 6000, "ICE"));
        Thing[] categoryList = {black, taro, greenTea};

        return black;
    }


    @Override
    public Thing[][] setCount() {
        System.out.println("setCount");
        milkTeaArray = new Thing[button][count];

        for (int i = 0; i < button; i++) {
            for (int j = 0; j < count; j++) {
                milkTeaArray[i][j] = milkTeaCategory();
            }
        }
        return milkTeaArray;
    }
}