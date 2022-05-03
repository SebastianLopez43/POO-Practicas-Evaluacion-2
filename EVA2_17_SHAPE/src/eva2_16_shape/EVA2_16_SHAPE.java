package eva2_16_shape;

/**
 * @author José Sebastian López Ibarra
 * April Tuesday 26 2022
 */

public class EVA2_16_SHAPE {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        // Crear objetos
        Triangle triangle = new Triangle(8, 6);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(9, 4);
        
        // Methods calculeArea
        System.out.println("    Triangle\n" + "Base: " + triangle.getBase() + 
                "    Height: " + triangle.getHeight());
        // System.out.println("Área: " + triangle.calculeArea());
        // printArea(triangle);  ||  Sólo acepta objetos de tipo Triangle.
        // printArea(circle);  ||  No acepta objetos de otro tipo.
        printArea(triangle);
        printType(triangle);
        classObject(triangle);
       
        System.out.println("    Circle\n" + "Radio: " + circle.getRadio());
        printArea(circle);
        printType(circle);
        classObject(circle);
        
        System.out.println("    Rectangle\n" + "Base: " + rectangle.getBase() + 
                "    Height: " + rectangle.getHeight());
        printArea(rectangle);
        printType(rectangle);
        classObject(rectangle);
        
        // Test c= new Test();
    }
    
    public static void printArea(Shape s){
        System.out.println("    Area: " + s.calculeArea() + "\n");
    }
    
    public static void printType(Shape s){

        // instanceof --> java --> instancia de una clase o una interfaz
        if (s instanceof Triangle){
            System.out.println("Type: " + s.Type() + "\n");
        } else if (s instanceof Rectangle){
            System.out.println("Type: " + s.Type() + "\n");
        } else if (s instanceof Circle){
            System.out.println("Type: " + s.Type() + "\n");
        } else {
            System.out.println("Type: Another\n");
        }
        
        // Restaurar el objeto
        // Convertir un tipo de dato en otro --> Casting
        
        // Triangle triangle = (Triangle)s; - Convertir triángulo en figura
    }
    
    public static void classObject(Object o){
        System.out.println(o.getClass() + "\n");
    }
    
    class Test{
    }
}