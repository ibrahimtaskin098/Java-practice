
package mortgagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;


public class MortgageCalculator {

   public static void main(String[] args) {
    final byte month = 12;
    final byte percentage = 100;
    Scanner scanner= new Scanner(System.in);
    int principal=0;
    int years;
    double yearlyInterestRate;
    System.out.print("Input your total ammount of the principal($1k-$1M):");
    
      while(true){
      
     principal = scanner.nextInt();
     if(principal >= 1000 && principal <= 1_000_000){
         break;  
     }
   
     System.out.print("Input your principal between (1_000 to 1_000_000):"); 
                 
    }
    System.out.print("Input your total year of the interest:");
   
      while(true){
          years = scanner.nextInt();
          if(years >= 0 && years <= 30){
               
              break;
          }
          System.out.print("Input your year between (1 to 30):");
          
      }
      System.out.print("Input your monthly interest rate:");
      while(true){
            yearlyInterestRate= scanner.nextDouble();
            if(yearlyInterestRate>=0 && yearlyInterestRate<=30){
                 break;
            }
           System.out.print("Input your yearly interest rate between (1 to 30):");
      }
         
      int numberOfMonth =  years*month;
         double monthlyInterestRate = (yearlyInterestRate)/(month*percentage);
          double mortgage = principal* (monthlyInterestRate * Math.pow(1+monthlyInterestRate, numberOfMonth))/(Math.pow(1+monthlyInterestRate, numberOfMonth)-1);
          String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
          
         System.out.println("Mortgage:"+mortgageFormatted);
       
      
    }
    
}
