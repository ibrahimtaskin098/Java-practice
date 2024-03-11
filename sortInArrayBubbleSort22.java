
package frequently30AskedQuestions;

import java.util.Arrays;


public class sortInArrayBubbleSort22 {
       public static void main(String[] args) {
                   int [] a = {6,10,14,2,1,3,6,9,2,5,1,1};
               System.out.println("Array in before sorting: "+Arrays.toString(a));
                   for(int i=0; i<a.length-1;i++){
                       for(int j=0;j<a.length-1;j++){
                           if(a[j]>a[j+1]){
                               int temp = a[j];
                               a[j]=a[j+1];
                               a[j+1] = temp;
                           }
                       }
                   }
                    System.out.println("Array in after sorting: "+Arrays.toString(a));
    }
}
