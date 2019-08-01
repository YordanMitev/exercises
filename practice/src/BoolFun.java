public class BoolFun {


    public static void main(String[] args) {
        boolean isMyGrandmaAMan = 2 > 4;
        System.out.println("isGrandmaAMan =  " + isMyGrandmaAMan);
        boolean isMyGrandpaAMan = true ;

        System.out.println( "Grandpa = " + isMyGrandpaAMan  );

        System.out.println("Grandpa + Grandma = " + ( isMyGrandmaAMan && 7 < 0  ));

        int val = 5 ;
        System.out.println( "result: -> " + ( true && ++val == 6 ));
        System.out.println(val);
    }
}
