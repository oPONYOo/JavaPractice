package com.example.javapractice.oop;

import java.util.Random;

public class MagicBeverage extends FinishedVendingMachine {
    private final Integer button;
    private final Integer count;

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(new MagicBeverage(3, 10));
        // 버튼 3개, 수량 10개씩
        vendingMachine.fillingMachine();
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
    protected Thing[][] setCount() {

        Thing[][] beverageArray = new Thing[button][count];

        for (int i = 0; i < button; i++) {
            for (int j = 0; j < count; j++) {
                beverageArray[i][j] = randomBeverageCategory();
            }
        }
        return beverageArray;
    }


}
