package Patterns;

//partern
//a  
//b c  
//d e f  
//g h i j 
public class Pattern9 {

    public static void main(String[] args) {
        char alpha = 'a';
        for (int i = 0; i < 5; i++) {
            for (int j=0; j <i;j++) {
                System.out.print(alpha+" ");
                alpha = (char) (alpha+1);
            }
            System.out.println(" ");
        }
    }

}
