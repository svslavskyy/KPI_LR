package com.lr1.DateTime;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DateProxy implements InvocationHandler{

        private Object obj;

        private DateProxy(Object obj) {
            this.obj = obj;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if (method.getName().startsWith("get")) {
                return method.invoke(obj, args);
            }
            throw new IllegalAccessException("Not allowed");
        }

        public static Object newProxyInstance(Object obj) {
            return java.lang.reflect.Proxy.newProxyInstance(
                    obj.getClass().getClassLoader(),
                    obj.getClass().getInterfaces(),
                    new DateProxy(obj)
            );
        }
    }