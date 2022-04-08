package eva2_9_abstract_classes;

/**
 * @author José Sebastian López Ibarra
 * Thursday March 31 2022
 */

public class EVA2_9_ABSTRACT_CLASSES {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Person per1 = new Person(); - Person is abstract; cannot be instantiated
        
        Client client1 = new Client("LOIS030501UGA", "José Sebastian López Ibarra", 18);
        client1.printData();
    }   
}