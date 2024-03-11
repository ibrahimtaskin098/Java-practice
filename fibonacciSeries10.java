package frequently30AskedQuestions;

// 0 1 2 3 4 5 6  7   8   9   10
// 0 1 1 2 3 5 8  13  21  34  55  finonacci series 
public class fibonacciSeries10 {

    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 1;
        System.out.print(n1+" "+n2);
        int sum = 0;
        int result = n1+n2;
        for (int i = 2; i <=10; i++) {
               sum = n1+n2;
               result = result +sum;
               System.out.print(" "+sum);
               n1 = n2;
               n2 = sum;
        }
        System.out.println("");
        System.out.println("Summation of the series "+result);
    }
}

// Another approach using recursion 

  /* class FibonacciSeries {
    
    public static void main(String[] args) {
       int n=10;
       for(int i =0; i<n; i++){
           System.out.print(fibonacci(i)+" ");
       }

          System.out.println("");
    }
    
    public static int fibonacci(int x){
        if(x>1){
            return fibonacci(x-1)+ fibonacci(x-2);
        }
        else{
            return x;
        }
    }
    
}
*/