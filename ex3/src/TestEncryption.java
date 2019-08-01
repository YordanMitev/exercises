public class TestEncryption {


    public static void main(String[] args) {
//        Kata.encryptThis("Hello") => "72olle"
//        Kata.encryptThis("good") => "103doo"

        EncryptionUtils encryptor = new EncryptionUtils();
        Assertions assertions = new Assertions();


        String expectedValue = encryptor.encrypt("Hello");
        assertions.assertEquals(expectedValue, "72olle");


        String encryptedValue = encryptor.encrypt("good");
        assertions.assertEquals(encryptedValue, "103doo");
    }
}
