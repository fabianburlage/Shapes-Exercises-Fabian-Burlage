import java.lang.Math;

public class Circle {


    private double radius;
    private double area;
    private double perimeter;


    public Circle (double radius){
        this.radius = radius;
        this.calculatePerimeter();
        this.calculateArea();

    }
    private void calculatePerimeter(){
        this.perimeter = 2 * Math.PI * this.radius;

    }

    private void calculateArea(){
        this.area = Math.PI * Math.pow(this.radius, 2);
    }

    public double getRadius(){
        return this.radius;

    }

    public double getPerimeter(){
        return this.perimeter;
    }

    public double getArea(){
        return this.area;
    }

}











