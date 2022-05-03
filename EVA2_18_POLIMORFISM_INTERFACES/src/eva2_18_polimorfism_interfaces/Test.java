package eva2_18_polimorfism_interfaces;

/**
 * @author José Sebastian López Ibarra
 * April Thursday 28 2022
 */

//                  IS - A 
public class Test implements Messages {

    @Override
    public void showMessages(String message) {
        System.out.println(message);
    }
    
    public void anotherMethod(){
        System.out.println("Aditional Method");
    }    
}