package main.homework.lesson6;

public class Calculator {
    int weight;
    int cost;
    String color = "белый";

    Calculator(int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
    }

    void summa() {
        System.out.println("Сумма = " + (weight + cost));
    }

    void difference() {
        System.out.println("Разность = " + (weight - cost));
    }

    void multiplication() {
        System.out.println("Умножение = " + (weight * cost));
    }

    void division() {
        System.out.println("Деление = " + (weight / cost));
    }

    void all() {
        System.out.println("weight = " + weight + "  weight = " + cost + " Цвет = " + color);
        summa();
        difference();
        multiplication();
        division();
    }

}
