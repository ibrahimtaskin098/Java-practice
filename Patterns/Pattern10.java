
package Patterns;


public class Pattern10 {
    public static void main(String[] args) {
        char alpha='a';
         for(int i=0;i<5;i++){
             for(int j=0;j<i+1;j++){
                 System.out.print(alpha+" ");
             }
             System.out.println("");
             alpha = (char)(alpha +1);
         }
    }
}
