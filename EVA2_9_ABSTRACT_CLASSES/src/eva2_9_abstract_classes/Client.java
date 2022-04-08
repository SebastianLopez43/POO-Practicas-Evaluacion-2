package eva2_9_abstract_classes;

/**
 * @author José Sebastian López Ibarra
 * Thursday March 31 2022
 */

public class Client extends Person{
    private String RFC;

    public Client() {
        super();
    }
    
    public Client(String RFC, String name, int age) {
        super(name, age);
        this.RFC = RFC;
    }

    public String getRFC() {
        return RFC;
    }
    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    
    @Override
    public void printData() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("RFC: " + RFC);
    }
}