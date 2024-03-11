
package frequently30AskedQuestions;


public class findMaxMinValueInArray18 {
    public static void main(String[] args) {
        
                int [] a = {8,20,6,4,5,6,7,56,9};
                int maxValue = a[0];                              // int maxValue=-1000;
                int minValue = a[0];          //int minValue =1111111;
                for(int i=0; i<a.length;i++){
                    if(a[i]>maxValue){
                        maxValue = a[i];
                    }
                    if(a[i]<minValue){
                        minValue=a[i];
                    }
                }
                System.out.println("Maximun element: "+maxValue);
                System.out.println("Minimum element: "+minValue);
                
    }
}
