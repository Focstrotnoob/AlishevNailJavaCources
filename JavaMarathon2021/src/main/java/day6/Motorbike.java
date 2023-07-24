package day6;

public class Motorbike {
    private String model;
    private String color;
    private int year;

    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

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
        if (year > 1884) {
            this.year = year;
        } else System.out.println("Первый мотоцикл появился в 1885 году");
    }

    public void info(){
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int inputYear){
        return Math.abs(year - inputYear);
    }
}