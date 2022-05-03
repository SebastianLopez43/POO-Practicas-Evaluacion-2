package eva2_16_shape;

/**
 * @author José Sebastian López Ibarra
 * April Tuesday 26 2022
 */

//               is a - todo "" es un:
public class Triangle extends Shape {
    private double base, height;

    public Triangle() {
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double calculeArea(){
        double area = base * height / 2;
        return area;
    }
    
    @Override
    public String Type(){
        return "Triangle";
    }
}