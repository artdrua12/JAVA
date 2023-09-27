import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Задача1
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int value = scaner.nextInt();

        int array[] = new int[value];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10);
            System.out.println(array[i]);
        }

    }
}
