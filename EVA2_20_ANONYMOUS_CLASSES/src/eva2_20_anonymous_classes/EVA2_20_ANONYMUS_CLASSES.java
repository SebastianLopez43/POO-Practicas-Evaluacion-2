package eva2_20_anonymous_classes;

/**
 * @author José Sebastian López Ibarra
 * April Thursday 28 2022
 */

/*
    Anonymus Class:
        Class without name.
*/

public class EVA2_20_ANONYMUS_CLASSES {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Messages message = new Messages() {
            @Override
            public void showMessages(){
                System.out.println("Message Interface");
            }
        };
        message.showMessages();
    }
}

interface Messages {
    public void showMessages();
}