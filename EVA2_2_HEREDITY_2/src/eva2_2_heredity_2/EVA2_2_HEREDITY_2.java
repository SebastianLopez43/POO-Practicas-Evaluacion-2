package eva2_2_heredity_2;

/**
 * @author José Sebastian López Ibarra
 * Wednesday March 16 2022
 */

public class EVA2_2_HEREDITY_2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Direction direc1 = new Direction("Circuito San José", 133, "Santa Elena", 31126, "Chihuahua", "Chihuahua", "6141070425");
        Student stud1 = new Student("21550362", "José Sebastian López Ibarra", 18, direc1);
        stud1.printData();
    }
}

/*
is a -> "Es un"
has a -> "Tiene un"
*/

class Direction {
    private String street, colony, city, state, numPhone;
    private int number, pC;
    
    public Direction() {
        this.street = "";
        this.colony = "";
        this.number = 0;
        this.pC = 0;
        this.city = "";
        this.state = "";
        this.numPhone = "";
    }
    
    public Direction(String street, int number, String colony, int pC, String city, String state, String numPhone) {
        this.street =street;
        this.colony = colony;
        this.number = number;
        this.pC = pC;
        this.city = city;
        this.state = state;
        this.numPhone = numPhone;
    }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getColony() {
        return colony;
    }
    public void setColony(String colony) {
        this.colony = colony;
    }

    public int getpC() {
        return pC;
    }
    public void setpC(int pc) {
        this.pC = pc;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public String getNumPhone() {
        return numPhone;
    }
    public void setNumPhone(String numPhone) {
        this.numPhone = numPhone;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    
    public void printDirection() {
        System.out.println("Street: " + street + " #" + number + ", Colony: " + colony + ", Postal Code: " + pC + 
                "\n" + city + " city, in " + state + " state.");   
    }
}

// Relation "is a" -> Studen is a Person
class Student extends Person {
    private String contNum;
    private Direction direction; // Relation "has a" -> Student has a direction 
    // direction is an object within instantiate, will go to instantiate in the constructor
    
    public Student() {
        super();
        this.contNum = "";
        // Instantiate Direction
        direction = new Direction();
    }

    public Student(String contNum, String name, int age, Direction direction) {
        super(name, age);
        this.contNum = contNum;
        this.direction = direction;
    }

    public String getContNum() {
        return contNum;
    }
    public void setContNum(String contNum) {
        this.contNum = contNum;
    } 
    
    @Override
    public void printData() {
        System.out.println("Control Number: " + contNum); 
        super.printData();       
        direction.printDirection();
    }
}

class Person {
    private String name;
    private int age;
    
    public Person() { // Constructor default
        this.name = "";
        this.age = 0;
    }
    
    public Person(String name, int age) { // Constructor with arguments
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
    public void setAge(int edad) {
        this.age = edad;
    }
    
    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}