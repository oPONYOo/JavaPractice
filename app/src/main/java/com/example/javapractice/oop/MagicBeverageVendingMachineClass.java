package com.example.javapractice.oop;

import com.example.javapractice.oop.dto.BeverageDto;

import java.util.Random;

public class MagicBeverageVendingMachineClass extends VendingMachineClass {
    public static void main(String[] args) {
        MagicBeverageVendingMachineClass beverageVendingMachine = new MagicBeverageVendingMachineClass();
        // 버튼 3개, 수량 10개씩
        beverageVendingMachine.fillingMachine(beverageVendingMachine.makeBeverageArray(3, 10));
    }


    private BeverageDto[][] makeBeverageArray(int button, int count) {
        BeverageDto[][] beverageArray = new BeverageDto[button][count];

        for (int i = 0; i < button; i++) {
            for (int j = 0; j < count; j++) {
                beverageArray[i][j] = randomBeverageCategory();
            }
        }
        return beverageArray;
    }

    private BeverageDto randomBeverageCategory() {
        BeverageCategory[] categoryList = BeverageCategory.values();
        int min = 0;
        int max = categoryList.length;

        Random random = new Random();
        int value = random.nextInt(max + min) + min;
        return categoryList[value].getBeverage();
    }
}
