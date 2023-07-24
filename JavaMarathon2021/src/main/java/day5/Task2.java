
package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Yamaha R1", "red", 2021);
        System.out.println("Model: " + motorbike.getModel() + "\nColor: " + motorbike.getColor() + "\nYear of release: " + motorbike.getYear());

    }
}