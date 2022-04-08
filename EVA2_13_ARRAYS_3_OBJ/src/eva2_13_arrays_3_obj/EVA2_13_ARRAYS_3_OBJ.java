package eva2_13_arrays_3_obj;

import java.util.Scanner;

/**
 * @author José Sebastian López Ibarra
 * Wednesday April 06 2022
 */

public class EVA2_13_ARRAYS_3_OBJ {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Person[] perArray = new Person[32]; 
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 32; i++) {
            // Create objects:
            perArray[i] = new Person();
            System.out.println("What's your name?");
            perArray[i].setName(input.nextLine());
        }

        // Show data
        for (int i = 0; i < 10; i++) {
            System.out.println("Name: " + perArray[i].getName());
        }        
    }   
}

class Person {
    private String name;
    
    public Person() {
        this.name = "";
    }

    public Person(String name) {
        this.name = name;
    }    

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}