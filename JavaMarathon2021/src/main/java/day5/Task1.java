
package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Hyundai Solaris");
        car.setColor("white");
        car.setYear(2018);
        System.out.println("Model: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Year of release: " + car.getYear());
    }
}