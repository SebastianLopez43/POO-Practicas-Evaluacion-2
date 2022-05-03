package eva2_19_interfaces_obj;

/**
 * @author José Sebastian López Ibarra
 * April Thursday 28 2022
 */

public class EVA2_19_INTERFACES_OBJ {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        Person person = new Person();
        person.setName("Sebastian");
        
        Messages message = person;
        message.showMessages();
    }    
}

class Person implements Messages {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void showMessages() {
        System.out.println("User Name: " + name);
    }
}

interface Messages {
    public void showMessages();
}