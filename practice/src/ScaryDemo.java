import java.util.Scanner;

public class ScaryDemo {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
//        String line = console.nextLine();
//        System.out.println("You've said : " + line);
        System.out.println("Please enter a number: ");
        int choice = console.nextInt();
        if (choice % 2 == 0){
            System.out.println(
                    "Your number " + choice + " is even !"
            );
        } else {
            System.out.println(
                    "Your number " + choice + " is odd !"
            );
        }


    }
}
