package com.lr1.DateTime;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DateTest {
    @Test
    public void checkDate() {
        int year = 1999, month = 10, day = 18;
        Date date = new Date(year, month, day);

        Assertions.assertEquals(year, date.getYear());
        Assertions.assertEquals(month, date.getMonth());
        Assertions.assertEquals(day, date.getDay());

        int addYear = 1, addMonth = 1, addDay = 5;
        Date addDate = new Date(addYear, addMonth, addDay);
        Date answerDate = new Date(year + addYear, month + addMonth, day + addDay);
        answerDate.getDate();
        Assertions.assertArrayEquals(answerDate.getDate(), date.add(addDate).getDate());

        date.setDay(addDay);
        date.setMonth(addMonth);
        date.setYear(addYear);

        Assertions.assertArrayEquals(date.getDate(), addDate.getDate());

    }
}
