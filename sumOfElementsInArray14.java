package frequently30AskedQuestions;

import java.util.Arrays;

public class sumOfElementsInArray14 {

    public static void main(String[] args) {
        //approach 1
//          int [] array = {1,2,3,4};   // another approach to array initialize
        /*    int [] array = new int[4];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        int result = 0;
       
        for(int i=0; i<array.length;i++){
            result = result + array[i];
        }
          System.out.println(result); 
    
         */
        int a[] = {1, 2, 3, 4};
  int sum = 0;
        for (int i : a) {
            sum = sum +i;

        }
           System.out.println(sum);
    }

}
