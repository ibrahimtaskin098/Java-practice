
package Patterns;
//pattern
//A  
//A B  
//A B C  
//A B C D  
//A B C D E  

public class Pattern8 {
    public static void main(String[] args) {
             for(int i=0;i<6;i++){
                 for(char j='A';j<'A'+i;j++){
                     System.out.print(j+" ");
                 }
                 System.out.println(" ");
             }
    }
}
