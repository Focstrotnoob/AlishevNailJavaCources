package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbOfFloor = scanner.nextInt();
        if (numbOfFloor >= 1 && numbOfFloor <= 4){
            System.out.println("Малоэтажный дом");
        } else if (numbOfFloor >= 5 && numbOfFloor <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (numbOfFloor >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
        scanner.close();
    }
}

