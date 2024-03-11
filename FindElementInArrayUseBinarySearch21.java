package frequently30AskedQuestions;
// Binary search algorithom uses when colections of data sorted
// if data arn't sorted then first we need to sort the data 

import java.util.Arrays;

// then we are using binary search algorithom and find the elements.
public class FindElementInArrayUseBinarySearch21 {

    //approach 2
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int key =100;
        int l = 0;
        int h = num.length - 1;

        
        boolean flag = false;
        while (h >= l) {
            int mid = (l + h) / 2;
              if(key == num[mid]){
                  System.out.println(" Element have found");
                  flag = true;
                  break;
              }
              else if(key>num[mid]){
                  l=mid+1;
              }
              else if (key<num[mid]){
                  h= mid-1;
              }
        }
        if(flag==false){
            System.out.println("Element haven't found");
        }

    }

    // approach 1 using java binary search method from arrays class
    /*       public static void main(String[] args) {
        
           int [] num = {2,5,7,2,8,9,3,4,7}; 
           int key =3;
           Arrays.sort(num); // after sorted 2,2,3,4,5,7,7,8,9
             System.out.println(Arrays.binarySearch(num, key)); 
    }
     */
}
