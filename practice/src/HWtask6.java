/* Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите им така, че
а1 да има стойността на а2, а2 да има стойността на а3, а а3 да има старата
стойност на а1.
*/

import java.util.Scanner;

public class HWtask6 {

    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

        System.out.println("Въведете число a1: ");
        int а1 = console.nextInt();

        System.out.println("Въведете число a2: ");
        int а2 = console.nextInt();

        System.out.println("Въведете число a3: ");
        int а3 = console.nextInt();

        а1 = а1 + а2 + а3;
        а2 = а1 - (а2 + а3);
        а3 = а1 - (а2 + а3);
        а1 = а1 - (а2 + а3);

        а1 = а1 + а2 + а3;
        а2 = а1 - (а2 + а3);
        а3 = а1 - (а2 + а3);
        а1 = а1 - (а2 + а3);
        System.out.println("a1 = " + а1);
        System.out.println("a2 = " + а2);
        System.out.println("a3 = " + а3);

    }




//    int a1 = 5; // ---> 7
//    int a2 = 7; // ---> 9
//    int a3 = 9; // ---> 5
//
//    a1 = a1 + a2 + a3; // a1 = (5 + 7 + 9 ----------------> 21)
//    a2 = a1 - (a2 + a3); // а2 = (21 - (7 + 9) -----------> 5)
//    a3 = a1 - (a2 + a3); // а3 = (21 - (5 + 9) -----------> 7)
//    a1 = a1 - (a2 + a3); // а1 = (21 - (5 + 7) -----------> 9)
//        System.out.println("a1 = " + a1);
//        System.out.println("a2 = " + a2);
//        System.out.println("a3 = " + a3);
//        System.out.println("--------------------------------------------");
//    a1 = a1 + a2 + a3;
//    a2 = a1 - (a2 + a3);
//    a3 = a1 - (a2 + a3);
//    a1 = a1 - (a2 + a3);
//        System.out.println("a1 = " + a1);
//        System.out.println("a2 = " + a2);
//        System.out.println("a3 = " + a3);



}
