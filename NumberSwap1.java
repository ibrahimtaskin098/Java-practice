package frequently30AskedQuestions;


class NumberSwap1{
    public static void main(String[] args) {
      int a =10, b=20;
        System.out.println("Before swapping the values are a= "+a+" b= "+b);
//        Logic1 use a variable.
        /*  int tempo = a;
          a = b;
          b= tempo;
         */
          
//        Logic2 use + and - operator without using new variable
         /* a = a+b; // 10+20 = 30
          b = a-b; // 30-20 = 10
          a = a-b; // 30-10 = 20
         */
//         Logic3 use * and / operator without using new operator new variable
         /* a = a*b; //10*20 = 200
          b = a/b; // 200/20 =10
          a = a/b; // 200/10= 20
          */
//         Logic4 use bitwise XOR(^)
         /* a = a^b; // 10 ^ 20 = 30;
          b = a ^b; // 30 ^ 20 = 10;
          a = a^b; // 30 ^ 10 = 20;
          */
         //Logic5 in a single statement
//         a = (a)+(b=a);
//           a = (a*3) - (b=a);
//          b = (a+b) - (a=b);
         System.out.println("After swapping the values are a= "+a+" b= "+b);

    }
}












// this is also working.
//public class NumberSwap {
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 10;
//     System.out.println("a= "+a+" b= "+b);
//      
//                int temp;
//           temp = a;
//           a=b;
//           b= temp;
//   
//        
//          System.out.println("a= "+a+" b= "+b);
//    }
//}



// This is the first process of swaping two inters value.
//public class NumberSwap {
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 10;
//     System.out.println("a= "+a+" b= "+b);
//        if(a<b){
//                int temp;
//           temp = a;
//           a=b;
//           b= temp;
//   
//        }
//          System.out.println("a= "+a+" b= "+b);
//    }
//}
