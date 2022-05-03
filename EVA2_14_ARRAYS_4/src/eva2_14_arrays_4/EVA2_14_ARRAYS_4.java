package eva2_14_arrays_4;

import java.util.Scanner;

/**
 * @author José Sebastian López Ibarra
 * Friday April 08 2022
 */

public class EVA2_14_ARRAYS_4 {
    // Constants in Java:
    public static final int SIZE = 32;
    public static final int SIZE1 = 15;
    
    // final -> Use to declarate constants
    // final -> Only allows to assign a value once

    /**
     * @param args the command line arguments
     */
            
    public static void main(String[] args) {
        int[] ageArray = new int[32]; 
        // Bytes that an integer occupies --> 4 bytes
        
        Scanner input = new Scanner(System.in);
        
        // 32 captures --> Cycle for
        // Capture data
        for (int i = 0; i < 32; i++) {
            System.out.println("Which is your age?");
            ageArray[i] = input.nextInt();
        }
        
        // Show data
        for (int i = 0; i < 32; i++) {
            System.out.print("[" + ageArray[i] + "]");
        }
        
        int[] ageArray1 = new int[SIZE]; 
        // Bytes that an integer occupies --> 4 bytes
        
        Scanner input1 = new Scanner(System.in);
        
        // 32 captures --> Cycle for
        // Capture data
        for (int i = 0; i < 32; i++) {
            System.out.println("Which is your age?");
            ageArray1[i] = input1.nextInt();
        }
        
        // Show data
        for (int i = 0; i < 32; i++) {
            System.out.print("[" + ageArray1[i] + "]");
        }
        
        int[] ageArray2 = new int[SIZE1]; 
        // Bytes that an integer occupies --> 4 bytes
        
        Scanner input2 = new Scanner(System.in);
        
        // 32 captures --> Cycle for
        // Capture data
        for (int i = 0; i < ageArray2.length; i++) {
            System.out.println("Which is your age?");
            ageArray2[i] = input2.nextInt();
        }
        
        // Show data
        for (int i = 0; i < ageArray2.length; i++) {
            System.out.print("[" + ageArray2[i] + "]");
        }
    }
}