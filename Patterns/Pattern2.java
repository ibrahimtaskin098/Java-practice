
package Patterns;

//pattern
//***********
// *********
//  *******
//   *****
//    ***
//     *

public class Pattern2 {
    public static void main(String[] args) {
              for(int i=0; i<6;i++){
                      //Space
                      for(int j=0;j<=i;j++){
                          System.out.print(" ");
                      }
                      //Star
                       for(int j=0;j<(6*2-2*i-1);j++){
                          System.out.print("*");
                      }
                      //Space
                       for(int j=0;j<=i;j++){
                          System.out.print(" ");
                      }
                       System.out.println("");
                   }
    }
    
}
