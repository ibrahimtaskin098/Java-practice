
package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class ArrayListClass {
    public static void main(String[] args) {
       List obj = new ArrayList();
        obj.add(23);
        obj.add("name");
        obj.add(5.6f);
        obj.add(1, "String");
      
        Iterator i = obj.iterator();
        
       
      while(i.hasNext()){
          System.out.println(i.next());
      }
      
      for(Object list : obj){
          System.out.println(list);
      }
      
    }
      
}
