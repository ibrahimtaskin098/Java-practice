
package frequently30AskedQuestions;


public class findElementInArrayUseLinearSearch20 {
          
    public static void main(String[] args) {
           int [] array = {3,7,9,45,3,6,8,23,5};
           int key = 6;
           boolean flag = true;
           for(int i =0; i<array.length;i++){
               if(key==array[i]){
                   System.out.println("Found element: "+array[i]);
                   flag = false;
                   break;
               }
           }
           if(flag==true){
               System.out.println("Haven't found ");
           }
    }
}
