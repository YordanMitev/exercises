public class IfElseDemo {

    public static void main(String[] args) {

        int num = 5 ;

        int other = 11;

        int isEven = other % 2;
        if ( isEven == 0 ){
            num++;
        }else {
            num = -4;
        }

        System.out.println("Num = " + num);

    }
}
