package eva2_1_heredity;

/**
 * @author José Sebastian López Ibarra
 * Monday March 13 2022
 */

public class EVA2_1_HEREDITY {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        /*
        Person per1 = new Person();
        per1.getName();
        
        Words in bold are own class
        */
        
        Student stud1 = new Student();
        stud1.setName("José Sebastian López Ibarra");
        stud1.setAge(18);
        stud1.setContNum("21550362");
        // stud1.showName();
        // System.out.println("Control Number: " + stud1.getContNum());
        stud1.printData();
        
        Teacher teach1 = new Teacher();
        teach1.setName("Verónica Valenzuela");
        teach1.setAge(46);
        teach1.setRegistNum("4136");
        teach1.printData();
    }   
    
    /*
    Classes within classes
    private/public class Something {
        
    }
    */
}

// SubClass (Son)
// Teacher extends (is a) Person
class Teacher extends Person { 
    // Registry number
    private String registNum;
    
    public Teacher() {
        super();
        System.out.println("TEACHER CLASS");
    }
    
    public Teacher (String name, int age, String registNum) {
        super(name, age);
        this.registNum = registNum;
    }
    
    public String getRegistNum() {
        return registNum;
    }
    public void setRegistNum(String registNum) {
        this.registNum = registNum;
    }
    
    @Override
    public void printData() {
        super.printData();
        System.out.println("Registry Number: " + registNum);
    }
}

// SubClass (Son)
// Student extends (is a) Person
class Student extends Person { 
    // Contro Number
    private String contNum;

    public Student() {
        super();
        System.out.println("STUDENT CLASS");
    }
    
    public Student(String name, int age, String contNum) {
        super(name, age);
        this.contNum = contNum;
    }
    
    public String getContNum() {
        return contNum;
    }
    public void setContNum(String contNum) {
        this.contNum = contNum;
    }
    
    /*
    public void showName() {
        System.out.println("Student Name: " + getName());
    }
    */
    
    // Anular, Ignorar method with the same name
    @Override
    public void printData() {
        super.printData(); // Call method printData() in Super Class
        System.out.println("Control Number: " + contNum + "\n");
    }
}

class Person { // SuperClass (Father)
    private String name;
    private int age;

    public Person() {
        this.name = "";
        this.age = 0;
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
    
    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }   
}