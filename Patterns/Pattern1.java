package Patterns;

// pattern
//    *    
//   ***   
//  *****  
// ******* 
//*********
public class Pattern1 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //space
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            //star
            for (int k = 0; k < 2 * i + 1;k++) {
                System.out.print("*");
            }

            //space
              for (int l = 0; l < 5 - i - 1; l++) {
                System.out.print(" ");
            }
              System.out.println("");

        }

    }
}
