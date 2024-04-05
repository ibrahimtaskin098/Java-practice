
package Patterns;

//Pattern
//*          *
//**        **
//***      ***
//****    ****
//*****  *****
//************
public class Pattern6 {
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            //star
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            //space
              for(int j=1 ;j<=(5*2-i*2);j++){
                System.out.print(" ");
            }
            //star
             for(int j=0;j<=i;j++){
                System.out.print("*");
            }
               System.out.println("");
        }
      
    }
    
}
