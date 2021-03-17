package com.lr1.DateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeTest {
    @Test
    public void checkTime(){
        int year = 1999, month = 10, day = 18;
        Date date = new Date(year, month, day);
        int hours = 5, second = 10;
        Time time = new Time(date, hours, second);
        Integer mas[] = {hours,second,day,month,year};

        Assertions.assertEquals(hours, time.getHours());
        Assertions.assertEquals(second, time.getSecond());
        Assertions.assertArrayEquals(mas, time.getTime());
    }

}
