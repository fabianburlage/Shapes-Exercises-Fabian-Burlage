import java.lang.Math;

public class Triangle {

    private double side;
    private double area;
    private double perimeter;

    public Triangle (double side){
        this.side = side;
        this.calculateArea();
        this.calculatePerimeter();
    }

    private void calculateArea(){
        this.area = (Math.sqrt(3)/4) * (Math.pow(this.side, 2));

    }

    private void calculatePerimeter(){
        this.perimeter = (3 * this.side);
    }

    public double getSide(){
        return this.side;
    }

    public double getArea(){
        return this.area;
    }

    public double getPerimeter(){
        return this.perimeter;
    }

}
