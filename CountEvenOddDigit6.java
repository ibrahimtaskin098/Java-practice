package frequently30AskedQuestions;

public class CountEvenOddDigit6 {

      public static void main(String[] args) {
            int num = 87592374;
            int countOdd = 0;
            int countEven = 0;
            while(num>0){   //1234 123 12 1
                int rem = num%10; // 4 3 2 1
                if(rem%2 == 0){ 
                    countEven++;  //1 2
                    
                }else{
                    countOdd++; //1 2
                }
                num = num/10; //123 12 1 0
            }
            System.out.println("Number of even digits of this number "+countEven);
            System.out.println("Number of odd digits of this number "+countOdd);
    }
    
    
    
    
    
    
    
    
    
    
    
    
//    public static void main(String[] args) {
//        int num = 1234567890;
//        int countEven = 0;
//        int countOdd = 0;
//        while (num > 0) {
//
//            if (num % 2 == 0) {
//                countEven++;
//            } else {
//                countOdd++;
//            }
//            num = num / 10;
//
//        }
//        
//        System.out.println("Even Digits ="+countEven+" Odd digits ="+countOdd);
//    }

}
