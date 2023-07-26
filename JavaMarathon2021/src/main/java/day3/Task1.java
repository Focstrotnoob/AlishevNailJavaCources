package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resultCountry;

        while (true) {
            String city = scanner.next();
            if (city.equalsIgnoreCase("stop")) {
                break;
            }
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    resultCountry = "Россия";
                    break;
                case "Рим":
                case "Турин":
                case "Милан":
                    resultCountry = "Италия";
                    break;
                case "Кёльн":
                case "Мюнхен":
                case "Берлин":
                    resultCountry = "Германия";
                    break;
                case "Лондон":
                case "Манчестер":
                case "Ливерпуль":
                    resultCountry = "Англия";
                    break;

                default:
                    resultCountry = "Неизвестная страна";

            }
            System.out.println(resultCountry);
        }
    }
}
