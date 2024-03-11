
package fibonacciseries;

 class FibonacciSeries {
    
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
