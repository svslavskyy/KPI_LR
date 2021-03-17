package com.lr1.DateTime;

import com.lr1.GetOver;

public class Date implements DateInterface{
    protected Integer year, month, day;

    public Date(){
        this.year = 1970;
        this.month = 1;
        this.day = 1;
    }

    public Date (Integer year, Integer month, Integer day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Date (Date date){
        this.year = date.year;
        this.month = date.month;
        this.day = date.day;
    }

    public Integer[] getDate(){
        Integer mas[] = {day,month,year};
        return mas;
    }

    @Override
    @GetOver
    public Integer getYear(){
        return year;
    }
    @Override
    @GetOver
    public Integer getMonth(){
        return month;
    }
    @Override
    @GetOver
    public Integer getDay(){
        return day;
    }

    @Override
    public void setYear(Integer year){
        this.year = year;
    }

    @Override
    public void setMonth(Integer month){
        this.month = month;
    }

    @Override
    public void setDay(Integer day){
        this.day = day;
    }

    @Override
    public String toString(){
        return String.format("%02d.%02d.%04d", this.day, this.month, this.year);
    }

    public Date add(Date other) {
        return new Date(
                this.year + other.year,
                this.month + other.month,
                this.day + other.day
        );
    }

}
