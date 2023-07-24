package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stopWord = "Stop";
        boolean stopProgram = false;

        while (!stopProgram){
            String city = scanner.next();
            if (!city.equals(stopWord)) {
                switch (city){
                    case "Москва":
                    case "Владивосток":
                    case "Ростов":
                        System.out.println("Россия");
                        break;
                    case "Рим":
                    case "Турин":
                    case "Милан":
                        System.out.println("Италия");
                        break;
                    case "Кёльн":
                    case "Мюнхен":
                    case "Берлин":
                        System.out.println("Германия");
                        break;
                    case "Лондон":
                    case "Манчестер":
                    case "Ливерпуль":
                        System.out.println("Англия");
                        break;

                    default:
                        System.out.println("Неизвестная страна");

                }
            } else {
                stopProgram = true;
            }
        }
    }
}
