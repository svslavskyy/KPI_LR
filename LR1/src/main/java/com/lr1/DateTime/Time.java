package com.lr1.DateTime;

import com.lr1.DateTime.Date;
import com.lr1.GetOver;

public class Time extends Date {
    private Integer hours, second;

    public Time(Date date, Integer hours, Integer second) {
        super(date);
        this.hours = hours;
        this.second = second;
    }

    public Time(Integer year, Integer month, Integer day, Integer hours, Integer second) {
        super(year, month, day);
        this.hours = hours;
        this.second = second;
    }

    public Integer[] getTime() {
        Integer mas[] = {hours, second, day, month, year};
        return mas;
    }

    @GetOver
    public Integer getHours() {
        return hours;
    }

    @GetOver
    public Integer getSecond() {
        return second;
    }

    public void sethours(Integer hours) {
        this.hours = hours;
    }

    public void setDay(Integer day) {
        this.hours = day;
    }

    @Override
    public String toString() {
        if (getMonth() < 10)
            return "Time: " + hours + ":" + second + " " + getDay() + ".0" + getMonth() + "." + getYear();
        else
            return "Time: " + hours + ":" + second + " " + getDay() + "." + getMonth() + "." + getYear();
    }


}
