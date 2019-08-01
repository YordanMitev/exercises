
/**
 * Your message is a string containing space separated words.
 * You need to encrypt each word in the message using the following rules:
 * The first letter needs to be converted to its ASCII code.
 * The second letter needs to be switched with the last letter
 * Keepin' it simple: There are no special characters in input.
 */
public class EncryptionUtils {


    String encrypt(String plainWord){
        char firstSymbol = plainWord.charAt(0);
        int asciValue = (int) firstSymbol;

        // get string length (x)
        // get current last symbol (x)
        // set second char as last
        // set second as previous last

        int length = plainWord.length();
        char lastSymbol = plainWord.charAt( length - 1 ) ;
        System.out.println("LastSymbol = " + lastSymbol);
        char secondSymbol = plainWord.charAt(1);
        System.out.println("Second Symbol = " + secondSymbol);
        String originalWithoutLastSymbol = plainWord.substring(0, length - 1 ) ;
        System.out.println("originalWithoutLastSymbol = " + originalWithoutLastSymbol);
        String lastReplaced = originalWithoutLastSymbol + secondSymbol ;
        System.out.println("lastReplaced= " + lastReplaced);

        String encryptedValue = String.valueOf(asciValue) + lastSymbol + lastReplaced.substring(2, length);
        System.out.println("Encrypted value =" + encryptedValue);
        return encryptedValue;
    }

}
