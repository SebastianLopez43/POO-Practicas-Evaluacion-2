package eva2_18_polimorfism_interfaces;

/**
 * @author José Sebastian López Ibarra
 * April Thursday 28 2022
 */

/*
            is - a
    SubClass extendes SuperClass
    SubClass implements Interface
*/

public class EVA2_18_POLIMORFISM_INTERFACES {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Test test = new Test();
        test.showMessages("Test Class Method");
        test.anotherMethod();
        show(test);
        show1(test);
    }

    public static void show(Messages m) {
        m.showMessages("Test Static Method");
    }
    
    public static void show1(Messages m) {
        m.showMessages("Method Static");
    }
}