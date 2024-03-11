package frequently30AskedQuestions;

// factorial means 
// 5! = 5 * 4 * 3 * 2 * 1 = 160
public class factorialOfANumber13 {

    //Approach 1
 /*   public static void main(String[] args) {
        int num = 5;
        int result = 1;
        for (int i = num; i >= 1; i--) {
                 
           //  result = result * i;
           result = result * num;
           num = num-1;
          
        }
        System.out.println(result);
    }
    
*/
    //Approach 2
    public static void main(String[] args) {
        
            System.out.println(factorial(5));
    }
    public static int factorial(int x){
        if(x==1){
            return 1;
        }else{
            int result = x * factorial(x-1);
            return result;
        }
    }
}
