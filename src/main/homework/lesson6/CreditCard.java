package main.homework.lesson6;

public class CreditCard {
    int count;
    String AccountNumber;

    CreditCard(int count, String string) {
        this.count = count;
        this.AccountNumber = string;
    }

    public void add(int money) {
        this.count += money;
        System.out.println("Вы добавили = " + money + " остаток = " + count + " Tекущий счет = " + AccountNumber);
    }

    public void information() {
        System.out.println("Tекущий счет = " + AccountNumber + " сумма " + count + " Tекущий счет = " + AccountNumber);
    }

    public void takeOff(int money) {
        if (this.count - money >= 0) {
            this.count -= money;
            System.out.println("Вы сняли = " + money + " остаток = " + count + " Tекущий счет = " + AccountNumber);
        } else {
            System.out.println(
                    "Вы не можете снять = " + money + " остаток = " + count + " Tекущий счет = " + AccountNumber);
        }

    }

}
