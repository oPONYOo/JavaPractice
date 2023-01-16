package com.example.learn_java.oop.product;

import com.example.learn_java.oop.MakingVendingMachine;
import com.example.learn_java.oop.Thing;

public class Ramen extends MakingVendingMachine {
    @Override
    public Thing[][] setCount() {
        return new Thing[0][];
    }
    // 면에 뜨거운 물을 붓는다, 물을 버린다, 국물을 붓는다, 차슈를 올린다.
}
