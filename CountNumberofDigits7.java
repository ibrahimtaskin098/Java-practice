
package frequently30AskedQuestions;

import java.util.Scanner;

       
public class CountNumberofDigits7 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0 ;
          while(num!=0){
              num = num/10;
              count++;
          }
          System.out.println(count);
    }
    
    
    
    
    // Another approach to count digits of a number.
//    public static void main(String[] args) {
//        String str = "1234";
//
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            count++;
//        }
//        System.out.println(count);
//          
//    }
//          
          
}
