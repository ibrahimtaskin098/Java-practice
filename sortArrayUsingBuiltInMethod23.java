
package frequently30AskedQuestions;

import java.util.Arrays;
import java.util.Collections;


public class sortArrayUsingBuiltInMethod23 {
          public static void main(String[] args) {
                     
              // Approach 1
            /*  int [] a ={4,6,8,9,2,3,5};
              System.out.println("Array before sorted"+Arrays.toString(a));
              Arrays.parallelSort(a);
                System.out.println("Array after sorted"+Arrays.toString(a));
               */
              // Approach 2
          /*    int [] a ={4,6,8,9,2,3,5};
              System.out.println("Array before sorted"+Arrays.toString(a));
              Arrays.sort(a);
                System.out.println("Array after sorted"+Arrays.toString(a));
           */
              // Approach 3
            Integer [] a ={4,6,8,9,2,3,5};
              System.out.println("Array before sorted"+Arrays.toString(a));
              Arrays.sort(a, Collections.reverseOrder());
                System.out.println("Array after sorted"+Arrays.toString(a));
    }
}
