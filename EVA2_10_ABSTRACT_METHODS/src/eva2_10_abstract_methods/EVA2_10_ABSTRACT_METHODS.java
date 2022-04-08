package eva2_10_abstract_methods;

/**
 * @author José Sebastian López Ibarra
 * Friday April 01 2022
 */

public class EVA2_10_ABSTRACT_METHODS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}

class AbstractImplement extends AbstractClass {
    
    @Override
    public void abstractMethod() {        
    }
}

// Abstract Methods: Without body, without implementation.
abstract class AbstractClass {
    public void implementMethod() {
        System.out.println("Implement Method.");
    }
    
    public abstract void abstractMethod();
}