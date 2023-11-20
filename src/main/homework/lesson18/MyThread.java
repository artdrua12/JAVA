package main.homework.lesson18;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyThread extends Thread {
    private int[] sortArray;

    public MyThread(int[] integers) {
        this.sortArray = integers;
    }

    public int[] sort(String methodName) throws NoSuchMethodException, SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {

        Method[] mthds = Sort.class.getDeclaredMethods();
        for (Method mthd : mthds) {
            if (mthd.getName().equals(methodName)) {
                mthd.invoke(mthd, this.sortArray);
            }
        }
        return sortArray;
    }

}
