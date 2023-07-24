
package day6;

public class Car {

    private String model;
    private String color;
    private int year;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1767) {
            this.year = year;
        } else System.out.println("Первый автомобиль появился в 1768 году");
    }

    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int inputYear){
        return Math.abs(year - inputYear);
    }
}