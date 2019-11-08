package com.example.demo;

import com.example.demo.event.SalesAmountType;
import com.example.demo.event.WeekType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        long amount = 10000L;

        long origin = SalesAmountType.ORIGIN_AMOUNT.calculate(amount);
        System.out.println("origin : " + origin);
        long supply = SalesAmountType.SUPPLY_AMOUNT.calculate(amount);
        System.out.println("supply : " + supply);
        long vat = SalesAmountType.VAT_AMOUNT.calculate(amount);
        System.out.println("vat : " + vat);
        long not = SalesAmountType.NOT_USED.calculate(amount);
        System.out.println("not : " + not);
    }

    @Test
    public void dateTest() {
        LocalDate date = LocalDate.of(2019, 11, 6);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int day = dayOfWeek.getValue();

        System.out.println("현재 요일 : " + dayOfWeek);
        TreeSet<Integer> list = new TreeSet<>();
        int[] arry = {1,2,4,8,16,32,64};
        System.out.println(arry[3]);
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekNumber = date.get(weekFields.weekOfMonth()) ;
        System.out.println(weekNumber *= 2);

    }


}
