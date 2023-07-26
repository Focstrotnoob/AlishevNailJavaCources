
package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int sum = 0;
        int tmpSum = 0;
        int index = -1;
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
        }
        for (int i = 1; i < array.length - 1; i++) {
            tmpSum = 0;
            tmpSum = array[i] + array[i - 1] + array[i + 1];

            if (sum < tmpSum) {
                sum = tmpSum;
                index = i;
            }
        }

        System.out.println(sum + "\n" + index);
    }
}