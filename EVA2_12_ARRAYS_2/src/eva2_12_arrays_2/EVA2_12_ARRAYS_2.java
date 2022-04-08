package eva2_12_arrays_2;

import java.util.Scanner;

/**
 * @author José Sebastian López Ibarra
 * Wednesday April 06 2022
 */

public class EVA2_12_ARRAYS_2 {

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
    }    
}