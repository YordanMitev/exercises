/* Въведете 2 различни целочислени числа от конзолата. Запишете тяхната сума,
разлика, произведение, остатък от деление и целочислено деление в отделни
променливи и разпечатайте тези резултати в конзолата. Опитайте същото с числа
с плаваща запетая.
*/

import java.util.Scanner;

public class HWtask2 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

            System.out.println("Mоля, въведете число A: ");
            int choice1 = console.nextInt();

            System.out.println("Mоля, въведете число B: ");
            int choice2 = console.nextInt();

                System.out.println("Заповядайте, вашите числа събрани: " + (choice1 + choice2));
                System.out.println("Заповядайте, вашите числа извадени: " + (choice1 - choice2));
                System.out.println("Заповядайте, вашите числа умножени: " + (choice1 * choice2));
                System.out.println("Заповядайте, вашите числа разделени: " + (choice1 / choice2));
                System.out.println("Заповядайте, вашите числа с остатък: " + (choice1 % choice2));



            System.out.println("Mоля, въведете число A: ");
            double choice3 = console.nextDouble();

            System.out.println("Mоля, въведете число B: ");
            double choice4 = console.nextDouble();

                System.out.println("Заповядайте, вашите числа събрани: " + (choice3 + choice4));
                System.out.println("Заповядайте, вашите числа извадени: " + (choice3 - choice4));
                System.out.println("Заповядайте, вашите числа умножени: " + (choice3 * choice4));
                System.out.println("Заповядайте, вашите числа разделени: " + (choice3 / choice4));
                System.out.println("Заповядайте, вашите числа с остатък: " + (choice3 % choice4));
    }
}
