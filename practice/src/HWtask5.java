/* Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ ред.
 */

import java.util.Scanner;

public class HWtask5 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

            System.out.println("Въведете число A: ");
            int choice1 = console.nextInt();

            System.out.println("Въведете число B: ");
            int choice2 = console.nextInt();

            System.out.println("Въведете число C: ");
            int choice3 = console.nextInt();

        if (choice1 > choice2) {
            int temp = choice1;
            choice1 = choice2;
            choice2 = temp;
        }

        if (choice2 > choice3) {
            int temp = choice2;
            choice2 = choice3;
            choice3 = temp;
        }

        if (choice1 > choice2) {
            int temp = choice1;
            choice1 = choice2;
            choice2 = temp;
        }

        System.out.println("Вашите числа в низходящ ред са: "
                + choice3 + " " + choice2 + " " + choice1);


    }
}
