package eva2_16_shape;

/**
 * @author José Sebastian López Ibarra
 * April Tuesday 26 2022
 */

public class Circle extends Shape {
    private double radio;

    public Circle() {
    }

    public Circle(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calculeArea(){
        double area = Math.PI*Math.pow(radio, 2);
        return area;
    }
    
    @Override
    public String Type(){
        return "Circle";
    }
}