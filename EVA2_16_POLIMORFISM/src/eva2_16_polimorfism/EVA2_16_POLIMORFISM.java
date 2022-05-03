package eva2_16_polimorfism;

/**
 * @author José Sebastian López Ibarra
 * April Monday 25 2022
 */

public class EVA2_16_POLIMORFISM {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
    } 
}

class Teacher {
    private String regNum;

    public Teacher() {
    }

    public Teacher(String regNum) {
        this.regNum = regNum;
    }

    public String getRegNum() {
        return regNum;
    }
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }
}

class Student {
    private String contNum;

    public Student() {
    }

    public Student(String contNum) {
        this.contNum = contNum;
    }

    public String getContNum() {
        return contNum;
    }
    public void setContNum(String contNum) {
        this.contNum = contNum;
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
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
}