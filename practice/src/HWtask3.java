/* Въведете 2 различни числа от конзолата и разменте стойността им. Разпечатайте
новите стойности
*/

import java.util.Scanner;

public class HWtask3 {

    public static void main(String[] args) {

        int m = 9;
        int p = 11;

        System.out.println("m преди обработката му = " + m);
        System.out.println("p преди обработката му = " + p);
        System.out.println("-------------------------------------------");

        m = m + p; //тук m = (9 + 11 = 20)
        System.out.println("m след обработката му = " + m);
        p = m - p; //тук p = (20 - 11 = 9), защото на горния ред m вече е станало 20
        System.out.println("p след обработката му = " + p);
        m = m - p; //тук m = (20 - 9 = 11)
        System.out.println("m след обработката му = " + m);
        System.out.println("-------------------------------------------");
        System.out.println("В момента числoто m = " + m);
        System.out.println("В момента числoто p = " + p);


    }
}
