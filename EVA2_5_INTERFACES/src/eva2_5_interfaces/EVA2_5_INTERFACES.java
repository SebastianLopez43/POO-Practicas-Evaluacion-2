package eva2_5_interfaces;

/**
 * @author José Sebastian López Ibarra
 * Tuesday March 29 2022
 */

public class EVA2_5_INTERFACES {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Person per1 = new Person();
        per1.setName("José Sebastian López Ibarra");
        per1.setAge(18);
        per1.showMessage();
        per1.printData();
        
        Vehicles vehicle1 = new Vehicles();
        vehicle1.setMark("Kia");
        vehicle1.setBrand("Rio");
        vehicle1.setYear(2021);
        vehicle1.showMessage();
        vehicle1.printData();
    }
    
}

class Person implements ShowData, Message{
    private String name;
    private int age;
    
    public Person() {
        name = "";
        age = 0;
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public void showMessage() {
        System.out.println("\nPERSON CLASS");
    }
    
    @Override
    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age " + age);
    }
}

class Vehicles implements ShowData, Message{
    private String mark, brand;
    private int year;

    public Vehicles() {
        mark = "";
        brand = "";
        year = 0;
    }

    public Vehicles(String mark, String brand, int year) {
        this.mark = mark;
        this.brand = brand;
        this.year = year;
    }

    public String getMark() {
        return mark;
    }
    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void showMessage() {
        System.out.println("\nVEHICLE CLASS");
    }

    @Override
    public void printData() {
        System.out.println("Mark: " + mark);
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }    
}

interface ShowData {
    // Interfaces only accept public methods
    // Interfaces only accept method declarations - Only accept abstract methods
    
    public void printData();
}

interface Message {
    public void showMessage();
}