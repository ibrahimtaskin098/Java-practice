
package frequently30AskedQuestions;

import java.util.Arrays;

public class reverseEachWordInString28 {
           public static void main(String[] args) {
                   String s = "Java is easy";
                   String[]  array = s.split("\\s");
                   String reverseString = "";
                   for(String w :array){
                       StringBuilder sb = new StringBuilder(w);
                  //  Object p =  sb.reverse();  
                  sb.reverse();
                    
                       reverseString = reverseString +sb.toString()+" ";
                   }
                   System.out.println(reverseString);
               
    }
    
    //Aproach 3
 /*   public static void main(String[] args) {
        String s ="WELCOME TO JAVA";
        String[] array = s.split(" ");
        String reverseString = "";
        for(String w : array){
            String reverseWord ="";
            for(int i=0;i<w.length(); i++){
                reverseWord =w.charAt(i) +reverseWord;
            }
            reverseString = reverseString + reverseWord +" ";
        }
         System.out.println(reverseString);
    }
    
  */  
    //Approach 2
 /*     public static void main(String[] args) {
        String s = "Java is easy";
        System.out.println("Before reverse:"+s);
       String[] array = s.split(" ");
       String str = "";
       String p = "";
       for(int i=0;i<array.length; i++ ){
           for(int j=0;j<array[i].length();j++){
               str = array[i].charAt(j) +str;
           }
         
           p = p + (array[i]=str)+" ";
           str="";
       }
         System.out.println("After reverse: "+p);
    }
*/
    
    //Approach 1
   /*   public static void main(String[] args) {
                 String s = "Java is easy";
                 System.out.println("Before each of the words reverse in the string: "+s);
                  
                
                   String [] array = s.split(" ");
               
                 String str = "";
                 String [] finalArray = new String[array.length]; 
                 
                for(int i =0;i<array.length;i++){
                    for(int j=0;j<array[i].length();j++){
                        str = array[i].charAt(j) +str;
                    }
                    finalArray[i] = str;
                    str = "";
                }
                String p ="";
                for(int i =0;i<finalArray.length;i++){
                    str = str +finalArray[i]+" ";
                }
                 System.out.println("Before each of the words reverse in the string: "+str);
                 
    }
 */
}
