
package frequently30AskedQuestions;

import java.io.FileWriter;
import java.io.IOException;


public class FileWriter30 {
    
               
    // file write
  public static void main(String[] args) {
         try{
                FileWriter obj = new FileWriter("filename.txt",true);
                obj.write("this is java code file");
                obj.close();
                
         }catch(IOException e){
             System.out.println(" An error occured");
         }
  
           
    }
      
   
}
