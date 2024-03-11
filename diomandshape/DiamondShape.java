
package diomandshape;

public class DiamondShape {
    public static void main(String[] args) {

        for (int i = 1; i <6; i++) {
            System.out.println("");

            for (int j = 1; j <= 5; j++) {

                System.out.print(i);
                if (i == j) {
                    break;
                }

            }

        }
        System.out.println(" ");
    }
}
