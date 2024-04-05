package Patterns;

//pattern
//*****
// ****
//  ***
//   **
//    *
//   **
//  ***
// ****
//*****
public class Pattern5 {

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            //space
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j <= 4 - i; j++) {
                System.out.print("*");
            }
              System.out.println("");
        }

        for (int k = 0; k < 5; k++) {
            //space
            for (int j = 0; j <= 5 - k - 1; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j <= k; j++) {
                System.out.print("*");
            }
             System.out.println("");
        }
      
    }
}
