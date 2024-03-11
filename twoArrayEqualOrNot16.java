package frequently30AskedQuestions;

import java.util.Arrays;

public class twoArrayEqualOrNot16 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1, 2, 3, 4, 5, 6};
        boolean check = Arrays.equals(a, b);
        if(check ==true){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays arn't equal");
        }
    }

    //Approach 1
    /*   public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 7};
        int[] b = {1, 2, 3, 4, 5, 6};
        int count = a.length;
        int checkCount = 0;
        if (a.length == b.length) {

            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[i]) {
                    checkCount++;
                }
            }
            if (checkCount == count) {
                System.out.println("Two arrays are equal.");
            } else {
                System.out.println("Two arrays are not equal.");
            }
        } else {
            System.out.println("Two arrays are not equal.");
        }

    }
     */
}
