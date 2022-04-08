package eva2_11_arrays;

/**
 * @author José Sebastian López Ibarra
 * Friday April 01 2022
 */

public class EVA2_11_ARRAYS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // The arrays are objects
        int[] array = new int[10];
        array[0] = 100;
        
        System.out.println("The value of the array[0] is = " + array[0]);
        
        array[1] = 200;
        array[2] = 300;
        array[3] = 400;
        array[4] = 500;
        array[5] = 600;
        array[6] = 700;
        array[7] = 800;
        array[8] = 900;
        array[9] = 1000; // Last Position
        System.out.println(array);
        System.out.println("Array length: " + array.length);
        // array[10] = 200; - Out of bounds
        
        String[] array1 = new String[10];
        array1[5] = "Hola Mundo";
        
        System.out.println("The value of the array1[5] is = " + array[5]);
        
        double[] array2 = new double[100];
        array2[99] = 1.4;
        
        System.out.println("The value of the array2[99] is = " + array2[99]);
        
        Person[] pooClass = new Person[32];
    }
}

class Person {
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
}