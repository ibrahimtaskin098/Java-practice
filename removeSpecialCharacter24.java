

package frequently30AskedQuestions;



public class removeSpecialCharacter24 {
      public static void main(String[] args) {
          String s = " sbfh234#$% %$@ ngru 67";
         s = s.replaceAll("[^A-Za-z0-9]", "  ");
          System.out.println(s);
    }
}
