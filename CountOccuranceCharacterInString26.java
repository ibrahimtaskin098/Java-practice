
package frequently30AskedQuestions;



public class CountOccuranceCharacterInString26 {
       public static void main(String[] args) {
                     String s = "Java is more easy language than other language";
                     int totalLength = s.length();
                     int lengthWithOutA = s.replaceAll("a", "").length();
                 //   System.out.println( s.replaceAll("a", ""));
                     int totalA = totalLength - lengthWithOutA;
                     System.out.println(totalA);

    }
}
