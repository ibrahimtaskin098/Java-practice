package frequently30AskedQuestions;

import java.util.Scanner;


public class FindLargestNumber9 {
    // Approach 1
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         int a = scanner.nextInt();
         int b = scanner.nextInt();
         int c = scanner.nextInt();

//       int large = (a>b)? a:b;
//       int largest = (c>large)? c:large;
         int largest1 = (c > (a > b ? a : b)) ? c : (a > b ? a : b); //
         System.out.println(largest1);
         
         
    }
    
    
    
    
    
    
    
    // Approach 2
//         public static void main(String[] args) {
//           int a = 54;
//           int b = 2126;
//           int c = 323;
//           if (a<b && b>c){
//               System.out.println(b);
//           }
//           else if(c>a && c>b){
//               System.out.println(c);
//           }else{
//               System.out.println(a);
//           }
//    }
}
