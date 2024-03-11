
package frequently30AskedQuestions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class readDataFromTextFile29 {
    // file read and show information
           public static void main(String[] args) {
                   try{
                        File obj = new File("filename.txt");
               Scanner scanner = new Scanner(obj);
               String match = "java";
               while(scanner.hasNext()){
                   String data = scanner.next();
                   if(data.contains(match))
                   System.out.println(data);
                   
               }
                       System.out.println(obj.canRead());
                       System.out.println(obj.canWrite());
                       System.out.println(obj.getAbsolutePath());
                       System.out.println(obj.getName());
                       System.out.println(obj.length());
               scanner.close();
                   }catch(IOException e){
                       System.out.println("An error occuerred");
                   }
              
           }
    
 
    
    // file creted
 /*   public static void main(String[] args) {
        try{
             File file = new File("filename.txt");
   if (file.createNewFile()){
       System.out.println("File created successfully");
   } else{
       System.out.println("File exixts");
   }
        }catch(IOException e){
            System.out.println(" Something did wrong");
        }
       
    }
*/

}