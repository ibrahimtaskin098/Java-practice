
package frequently30AskedQuestions;


public class printEvenOddFromArray15 {
             
    //Approach 3
    public static void main(String[] args) {
         int [] a = {1,2,3,4,5,6};
      for(int value:a){
          if(value%2==0){
               System.out.println("Even "+value);
      }else{
              System.out.println("Odd "+value);
          }
          }
         
    }
    
    
    
    
    
    
    
    
    
    // Approach 2
  /*  
    public static void main(String[] args) {
            int [] a = {1,2,3,4,5,6};
            System.out.print("Print Even Number: ");
            for(int i =0;i<a.length;i++){
        if(a[i]%2==0){
            System.out.print(a[i]+" ");
        }
    }
            System.out.println(" ");
            System.out.print("Print odd number: ");
            for(int i =0;i<a.length;i++){
        if(a[i]%2!=0){
            System.out.print(a[i]+" ");
        }
    }
            System.out.println("");
    }
    
    */
    
    
    // Approach 1
    
    /*
             public static void main(String[] args) {
                       int [] a = {1,2,3,4};
                       for(int i = 0; i<a.length;i++){
                           int checkNum = a[i];
                           if(checkNum%2==0){
                               System.out.println("Even numbers: "+checkNum);
                           }
                             if(checkNum%2!=0){
                               System.out.println("Odd numbers: "+checkNum);
                           }
                          
                       }
    }
    
    */
    
}
