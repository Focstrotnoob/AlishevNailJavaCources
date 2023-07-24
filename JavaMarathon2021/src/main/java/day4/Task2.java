package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int multipleOfTen = 0;
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }

        for (int x : array) {
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
            if ((x % 10 == 0) && (x != 0)) {
                multipleOfTen++;
                sum += x;
            }

        }
        System.out.println(max + "\n" + min + "\n" + multipleOfTen + "\n" + sum);
    }
}
