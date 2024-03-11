
package frequently30AskedQuestions;

import java.util.Scanner;


public class PalindromeString5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        String rev ="";
//        for(int i =0; i<str.length(); i++){
//            rev = str.charAt(i) + rev;
//        }
        
        char[] c = new char [str.length()];
        for(int i =0; i<str.length(); i++){
            c[i] = str.charAt(i);
            rev = c[i] + rev;
        }
//              for(int i =str.length()-1; i>=0;i--){
//                  System.out.print(c[i]);
//              }
//                System.out.println(" ");
        
        if (rev.equals(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
