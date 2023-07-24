package day6;

public class Task1 {
    public static void main(String[] args) {
        Motorbike moto = new Motorbike("Yamaha R1", "white", 1975);

        moto.info();
        System.out.println(moto.yearDifference(2023));

    }
}