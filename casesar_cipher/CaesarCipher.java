public class CaesarCipher {

  private String ALPHABET = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  public String encrypt(String plainText, int key) {
    String cipherText = "";

    plainText = plainText.toUpperCase();

    for (int i = 0; i < plainText.length(); i++) {
      char character = plainText.charAt(i);
      int charIndex = ALPHABET.indexOf(character);
      int encryptedIndex = Math.floorMod(charIndex + key, ALPHABET.length());
      cipherText += ALPHABET.charAt(encryptedIndex);
    }

    return cipherText;
  }

  public String decrypt(String cipherText, int key) {
    String plainText = "";
    for (int i = 0; i < cipherText.length(); i++) {
      char character = cipherText.charAt(i);
      int charIndex = ALPHABET.indexOf(character);
      if (charIndex == -1) {
        plainText += character;
        continue;
      }
      int decryptedIndex = Math.floorMod(charIndex - key, ALPHABET.length());
      plainText += ALPHABET.charAt(decryptedIndex < 0 ? decryptedIndex + ALPHABET.length() : decryptedIndex);
    }
    return plainText;
  }
}
