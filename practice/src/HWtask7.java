/* Въведете 3 променливи от клавиатурата – час (целочислен тип), сума пари (число
с плаваща запетая), дали съм здрав – булев тип. Съставете програма, която
взема решения на базата на тези данни по следния начин:
- ако съм болен няма да излизам
- ако имам пари ще си купя лекарства
- ако нямам – ще стоя вкъщи и ще пия чай
- ако съм здрав
- ако имам по-малко от 10 лв ще отида на кафе и т.н
Полученото решение покажете като съобщение в конзолата.
*/
import java.util.Scanner;

public class HWtask7 {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

        System.out.println("Час: ");
        int c = console.nextInt();

        System.out.println("Пари: ");
        double m = console.nextDouble();

        System.out.println("Болен ли съм: (true or false)");
        boolean h = console.nextBoolean();

        if (h) {
            System.out.println("Ще си остана във вкъщи и няма да излизам.");

            if (m > 0) {
                System.out.println("Ще помоля някой приятел да му купи лекарства.");
            }
            if (m == 0) {
                System.out.println("Ехеее свършил съм парите и май ще трябва да се лекувам само с чай.");
            }
        } else {
            if (m >= 10) {
                System.out.println("Днес ще съм парж и ще отида на кафенце с приятели.");
            }
            if (m < 10) {
                System.out.println("Пак яко съм се охарчил, дори 10 лева нямам в себе си. Ще ходя на работа!");
            }
        }


    }
}