package frequently30AskedQuestions;

public class SumOfDigitsInNumber8 {

    public static void main(String[] args) {
                int num = 1234;
                int sumOfEveryDigits = 0;
                while(num>0){  // 1234 123 12 1
                    int lastDigitOfNum = num%10; //4 3 2 1
                    sumOfEveryDigits = sumOfEveryDigits + lastDigitOfNum;  //0+4=4   4+3 = 7 7+2=9 9+1=10
                    num = num/10; //123 12 1 0
                }
          
                 System.out.println(sumOfEveryDigits);
        
    }
}
