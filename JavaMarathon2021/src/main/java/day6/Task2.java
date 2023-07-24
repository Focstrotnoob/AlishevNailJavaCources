package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2005, 15000, 45000);
        airplane.setYear(1995);
        airplane.setLength(14000);
        airplane.fillUp(500);
        airplane.fillUp(400);
        airplane.info();


    }
}