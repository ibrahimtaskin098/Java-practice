package frequently30AskedQuestions;

import java.util.Arrays;
import java.util.HashSet;

public class findDuplicateElementInArray19 {
    
    //Approach 3
    public static void main(String[] args) {
         HashSet<String> name = new HashSet<>();
         String[] array ={"java","python","c","java"};
//        System.out.println(name.add("java"));
//        System.out.println(name.add("python"));
//        System.out.println(name.add("java"));
          boolean flag = false;
           for(String value: array){
               if(name.add(value)== false){
                   System.out.println("Duplicate element have found: "+value);
                   flag =true;
               }
           }
           if(flag==false){
               System.out.println("Duplicate element haven't found");
           }
    }
    
    
        
    //Approach 2
 /*   public static void main(String[] args) {
        String [] array = {"java","python","c","java"};
        boolean flag = false;
        for(int i =0; i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    System.out.println("Find duplicate element: "+array[i]);
                    flag =true;
                }
            }
        }
        if(flag==false){
            System.out.println("Didn't find duplicate element");
        }
    }
    
   */ 
    
    

    // Approach 1
 /*   public static void main(String[] args) {
        int[] a = {2, 3, 5, 6, 7, 8, 3, 7};
        int[] duplicate = new int[a.length];;

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    duplicate[i] = a[i];
                }
            }
        }
        System.out.println("Duplicate Element is " + Arrays.toString(duplicate));
    }
*/

}
