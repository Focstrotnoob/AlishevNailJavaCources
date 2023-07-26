package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2018 ,40000, 40000);
        Airplane airplane2 = new Airplane("Superjet", 2023 ,30000, 25000);
        Airplane.compareAirplanes(airplane1,airplane2);
    }
}