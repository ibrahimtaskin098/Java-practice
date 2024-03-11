package frequently30AskedQuestions;
// greater than >1
// prime number has two factors are divide by ifself and 1.

import java.util.Scanner;

public class checkPrimeNumber11 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;

        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Prime Number");
            } else {
                System.out.println("NotPrime Numbeer");
            }

        } else {
            System.out.println("Not prime Number");
        }
    }

}
