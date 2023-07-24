package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int indexLine = 0;
        int lineSum = 0;
        int tmpSum;
        Random random = new Random();
        int[][] array = new int[12][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(51);
            }
        }


        for (int i = 0; i < array.length; i++) {
            tmpSum = 0;
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
                tmpSum += array[i][j];
            }
            if (lineSum <= tmpSum){
                lineSum = tmpSum;
                indexLine = i;
            }

            System.out.println();
        }
        System.out.println(indexLine);
    }
}