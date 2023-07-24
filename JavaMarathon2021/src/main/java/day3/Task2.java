package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean stop = false;

        while (!stop){
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            if (y != 0) {
                System.out.println(x / y);
            } else break;
        }


    }
}
