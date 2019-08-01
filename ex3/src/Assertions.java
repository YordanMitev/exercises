
public class Assertions {


    boolean assertEquals(String expectedValue, String value ){

        boolean assertion = value.equals(expectedValue) ;
        if ( assertion ){
            System.out.println("Code is working");
        }else {
            System.out.println("Code is not working");
        }

        return assertion;
    }

}
