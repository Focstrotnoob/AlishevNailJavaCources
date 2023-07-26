package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int sum = 0;
        int equalToOne = 0;
        int biggerEight = 0;
        Scanner scanner =  new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }
        for (int x : array) {
            sum += x;
            System.out.print(x + " ");

            if (x % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
            if (x == 1) {
                equalToOne++;
            }
            if (x > 8) {
                biggerEight++;
            }
        }
        System.out.println("\nДлина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + biggerEight);
        System.out.println("Количество чисел равных 1: " + equalToOne);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);


    }
}
