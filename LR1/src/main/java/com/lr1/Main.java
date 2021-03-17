package com.lr1;

import com.lr1.DateTime.Date;
import com.lr1.DateTime.DateInterface;
import com.lr1.DateTime.DateProxy;
import com.lr1.DateTime.Time;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Date date1 = new Date(2021, 2, 21);
        System.out.println(date1.toString());
        System.out.println(date1.add(new Date(5, 4, 5)));
        Time time1 = new Time(2021, 10, 21, 14, 55);
        System.out.println(time1);
        System.out.println(Arrays.toString(time1.getDate()));

        //task2
        System.out.println("\nAnnotation:");
        for (Method m : date1.getClass().getMethods()) {
            if (m.isAnnotationPresent(GetOver.class)) {
                try {
                    System.out.println("\tCalling method " + m.getName() + ", got: " + m.invoke(date1));
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }


        //task3
        System.out.println("\nClass name of Time object is: " + time1.getClass().getName());
        System.out.println("List of constructors with their parameters");
        Class clazz = time1.getClass();
        Constructor[] constructors1 = clazz.getConstructors();
        for (Constructor constructor : constructors1) {
            Class[] params = constructor.getParameterTypes();
            for (Class param : params) {
                System.out.println(param.getName());
            }
        }

        int mods = clazz.getModifiers();
        if (Modifier.isPublic(mods)) {
            System.out.println(mods + " public");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.println(mods + " abstract");
        }
        if (Modifier.isFinal(mods)) {
            System.out.println(mods + " final");
        }

        //task4
        Date date2 = new Date(2021, 2, 21);
        DateInterface proxy = (DateInterface) DateProxy.newProxyInstance(date2);
        System.out.println("\nGet hours: " + proxy.getYear());
        try {
            proxy.setDay(5);
        } catch (Throwable e) {
            System.err.println("Got exception: " + e);
        }
        System.out.println(date2);

    }
}
