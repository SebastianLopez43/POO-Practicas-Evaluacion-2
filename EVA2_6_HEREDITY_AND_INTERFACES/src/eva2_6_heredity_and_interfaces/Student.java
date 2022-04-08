package eva2_6_heredity_and_interfaces;

/**
 * @author José Sebastian López Ibarra
 * Wednesday March 30 2022
 */

public class Student extends Person implements ShowMessages{
    private String contNum;

    public Student() {
        super(); // Person Default Constructor
        contNum = "";
    }

    public Student(String contNum, String name, int age) {
        super(name, age); // Person Constructor (Superclass)
        this.contNum = contNum;
    }

    @Override
    public void printData() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Control Number: " + contNum);
    }
}