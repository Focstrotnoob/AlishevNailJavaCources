package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>(Arrays.asList("Audi", "Lada", "Mercedes", "BMW", "Tesla"));

        cars.add(3,"Honda");
        cars.remove(1);
        System.out.println(cars);

    }
}
