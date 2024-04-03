public class Main {
  public static void main(String[] args) {
      String text = "Hello World";
      int KEY = 3;

      CaesarCipher cipher = new CaesarCipher();

      System.out.println("---Encrypted Text---");
      System.out.println(cipher.encrypt(text, KEY));
      System.out.println("---Decrypted Text---");
      System.out.println(cipher.decrypt(text, KEY));
  }
}
