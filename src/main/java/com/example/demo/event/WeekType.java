package com.example.demo.event;

import java.util.function.Function;

public enum WeekType {
    TEST1(1,1),
    TEST2(2,2),
    TEST3(3,4),
    TEST4(4,8),
    TEST5(5,16),
    TEST6(63,2),
    TEST7(7,64);

    private int value1;
    private int value2;

    WeekType(int value1) {
        this.value1 = value1;
    }

    WeekType(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue1(){
        return value1;
    }

    public int getValue2(){
        return value2;
    }
}
