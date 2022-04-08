package eva2_8_heredity_interfaces_2;

/**
 * @author José Sebastian López Ibarra
 * Thursday March 31 2022
 */

public class EVA2_8_HEREDITY_INTERFACES_2 {


    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Test test = new Test();
        test.methodA();
        test.methodB();
    }
}   

class Test implements B{

    @Override
    public void methodB() {
    }

    @Override
    public void methodA() {
    }
}

interface A{
    public void methodA();
}

interface B extends A{
    public void methodB();
}