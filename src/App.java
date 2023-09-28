import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Задача1
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int value = scaner.nextInt();

        int array[] = new int[value];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        System.out.print("Задание 1. Вывод массива сначала и с конца \n");

        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        int countZero = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            } else if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
            if (array[i] == 0) {
                countZero++;
            }
            System.out.print(" " + array[i]);
            System.out.println(" " + array[value - 1 - i]);
        }

        System.out.println("Задание 2. Максимальное = " + max + " Минимальное = " + min);
        System.out.println("Задание 3. Индекс Макс = " + maxIndex + " Индекс Мин = " + minIndex);
        System.out.print("Задание 4. Количество нулевых элементов ");
        System.out.println(countZero == 0 ? "Не найдено" : countZero);

        for (int i = 0; i < Math.round(array.length / 2); i++) {
            int first = array[i];
            array[i] = array[value - 1 - i];
            array[value - 1 - i] = first;
        }

        System.out.println("Задание 5. Массив перевертыш = " + Arrays.toString(array));

        boolean isSequence = true;

        int arraySequence[] = { 1, 2, 3, 4, 5 };

        for (int i = 1; i < arraySequence.length; i++) {
            if (arraySequence[i - 1] > arraySequence[i]) {
                isSequence = false;
                break;
            }
        }

        System.out.println("Задание 6. Массив возрастающая последовательность = " + isSequence);

    }
}
