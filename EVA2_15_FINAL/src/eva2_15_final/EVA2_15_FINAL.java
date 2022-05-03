package eva2_15_final;

/**
 * @author José Sebastian López Ibarra
 * Friday April 08 2022
 */

public class EVA2_15_FINAL {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
}

/*class PostGraduateStudent extends Student {
    
}*/

final class Student extends Person {
    private String contNum;

    public Student() {
    }

    public Student(String contNum, String name, int age) {
        super(name, age);
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