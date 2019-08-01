/* Въведете 2 различни числа от конзолата и ги разпечатайте в нарастващ ред.
*/

import java.util.Scanner;

public class HWtask4 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

            System.out.println("Число A: ");
            int babati = console.nextInt();

            System.out.println("Число B: ");
            int dqdoti = console.nextInt();



//        int babati = 1; // 1 + 1
//        int dqdoti = 2; // 2 + 1

                System.out.println("Число A: " + ++babati);
                System.out.println("Число B: " + ++dqdoti);
    }
}

