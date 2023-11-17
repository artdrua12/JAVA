package main.homework.lesson18;

import java.util.Arrays;

public class MyThread extends Thread {
    private Integer[] arr;

    public MyThread(Integer[] arr) {
        this.arr = arr;
    }

    public Integer[] print() {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
        }
        return arr;

    }

}
