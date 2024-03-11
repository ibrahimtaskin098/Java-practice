package generics;

import java.util.ArrayList;


class Container<T extends Number> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    void demo(){
        
    }
    public void method(ArrayList<? extends T> abc){
        
    }
    
}




public class GenericDemo {

    public static void main(String[] args) {
        Container<Integer>  obj = new Container<Integer>();
        
        obj.setValue(57);
        int s = obj.getValue();
        System.out.println(s);
        obj.demo();
        obj.method(new ArrayList<Integer>());
        
        
}
}