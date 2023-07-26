package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double result = 0;

        if ((x > -3) && (x < 5)){
            result = (x + 3)*((Math.pow(x, 2) - 2));
        } else if (x >= 5) {
            result = (Math.pow(x, 2) - 10) / (x + 7);
        } else result = 420.0;

        System.out.println(result);


    }
}
