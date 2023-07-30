package day12;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();
        Task2.fill(0, 30, numbers);
        System.out.println(numbers);
        Task2.fill(300, 350, numbers);
        System.out.println(numbers);


    }

    public static void fill(int from, int before, List<Integer> list){
        Integer[] array  = new Integer[before - from];
        Random random = new Random();
        for (int i = from; i < before + 1; i++) {
            if (i % 2 == 0){
                list.add(i);
            }

        }

    }
}
