/* Да се изведат съобщения към потребителя и да се прочетат 2 числа от
клавиатурата A и B (може да са с плаваща запетая – double). После да се прочете
3-то число C и да се провери дали то е м/у A и B. Да се изведе подходящо
съобщение за това дали C е между A и B.
*/

import java.util.Scanner;

public class HWtask1 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

            System.out.println("Въведете A: ");
            double choice1 = console.nextDouble();

            System.out.println("Въведете B: ");
            double choice2 = console.nextDouble();

            System.out.println("Въведете C: ");
            double choice3 = console.nextDouble();

if (choice3 > choice1 && choice3 < choice2) {
    System.out.println("Въведеното число е между A и B");
    }
if (choice3 < choice1) {
    System.out.println("Въведеното число е по-малко от А");
    }
if (choice3 > choice2) {
    System.out.println("Въведеното число е по-голямо от Б");
    }


    }
}
