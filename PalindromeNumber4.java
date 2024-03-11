
package frequently30AskedQuestions;

import java.util.Scanner;


public class PalindromeNumber4 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int num = scanner.nextInt();
      int original_num = num;
      int rev = 0;
      while(num!=0){
          rev = rev*10 +num%10;
          num = num/10;
      }

         if(rev == original_num){
             System.out.println("Prlindrome");
         }else{
             System.out.println("Not Palindrome");
         }
          
    }
}
