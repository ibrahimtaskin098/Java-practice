package Patterns;

//pattern
public class Patern11 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            //space
            for (int j = 0; j <= 5 - i - 1; j++) {
                System.out.print(" ");
            }

            //alpha
            char alpha = 'A';
            int breakpoint = ((2 * i + 1) / 2);
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print(alpha + "");
                if (j < breakpoint) {
                    alpha++;
                    
                } else {
                    alpha--;
                }

            }

            //space
            for (int j = 0; j <= 5 - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
