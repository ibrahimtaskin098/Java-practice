
package stacks;

import java.util.Stack;

public class stackUseJavaLibrary {
       public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
           System.out.println(s.pop());
           System.out.println(s.size());
        
    }
}
