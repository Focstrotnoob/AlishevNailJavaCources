
package day8;

public class Task1 {
    public static void main(String[] args) {
        String str = "str";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000;  i++) {
            str = str + i;
        }
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));

        StringBuilder stringBuilder = new StringBuilder("str2");
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 20000;  i++) {
            stringBuilder.append(i);
        }
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime2 - startTime2));

    }
}