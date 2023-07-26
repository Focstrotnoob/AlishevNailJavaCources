package day9.Task2;

public class Triangle extends Figure {

    double lengthSide1;
    double lengthSide2;
    double lengthSide3;

    public Triangle(double lengthSide1, double lengthSide2, double lengthSide3, String color) {
        super(color);
        this.lengthSide1 = lengthSide1;
        this.lengthSide2 = lengthSide2;
        this.lengthSide3 = lengthSide3;
    }

    @Override
    public double area() {
        return Math.sqrt((perimeter()/2)*(perimeter()/2 - lengthSide1) * ((perimeter()/2) - lengthSide2) * ((perimeter()/2) - lengthSide3));
    }

    @Override
    public double perimeter() {
        return lengthSide1 + lengthSide2 + lengthSide3;
    }
}