package frequently30AskedQuestions;


import java.util.Scanner;


public class ReverseANumber2 {
       public static void main(String[] args) {
       
       Scanner scanner = new Scanner(System.in);
       int num = scanner.nextInt();
       scanner.close();
       
//       Logic1 using algorithm
/*
        int rev = 0;
        while(num!=0){
           rev=rev*10 +num%10;
           num = num/10;
       }
              System.out.println(rev);
*/

//         logic2 using StringBuffer class
    /*     StringBuffer sb = new StringBuffer(String.valueOf(num));
         StringBuffer rev = sb.reverse();
           System.out.println(rev);
        */
    
//    logic3 StringBuilder class
 /*                
      StringBuilder sb = new StringBuilder();
       sb.append(num);
       StringBuilder rev = sb.reverse();
           System.out.println(rev);
      */
      
    }
}
