
package frequently30AskedQuestions;


public class countWordInString27 {
       public static void main(String[] args) {
                   String s = "I Love Bangladesh";
                  int count= 1;
                   for(int i=0; i<s.length()-1;i++){
                       if((s.charAt(i)==' ')&&( s.charAt(i+1)!=' ')){
                           count++;
                       }
                   }
                   System.out.println("Total word of this string "+count);
    }
}
