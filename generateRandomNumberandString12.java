
package frequently30AskedQuestions;

import static java.lang.Math.random;
import java.util.Random;


public class generateRandomNumberandString12 {
      public static void main(String[] args) {
         // Approach 1
//         for(int i=0; i<100;i++){
//              int random = (int) (Math.random() * 10);
//             System.out.print(random+" ");
//         }
   // Approach 2
       /*
            Random num = new Random();
             int i = num.nextInt(5);
             double d = num.nextDouble();
             long  l = num.nextLong();
             System.out.println(i);
             System.out.println(d);
             System.out.println(l);
        */
       
       // approach to generate a random String.
       int length = 10;
       String alphabet ="ABCDEFGHIJKLMNOPQRSTWXYZ";
       char [] randomString = new char[length];
       for(int i=0; i<length;i++){
           int randomIndex = (int)(Math.random() * alphabet.length());
           randomString[i]=alphabet.charAt(randomIndex);
       
       }
          System.out.println(randomString);
       
    }
}
