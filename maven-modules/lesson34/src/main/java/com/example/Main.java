package com.example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Logger logger = LoggerFactory.getLogger(Main.class);
        logger.info("Hello World !!");
    }
}