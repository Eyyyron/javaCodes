package FirstYearShortTermAndSecondYearFirstTerm.midterms;

import java.lang.*;
import java.util.Random;

public class AguilarAaronKyleSecret implements Encryptable {
    private String message;
    private boolean encrypted;
    private String key;
    private Random generator;

    public AguilarAaronKyleSecret(String givenMessage){
        message = givenMessage;
        encrypted = false;
        generator = new Random();
        key = generateKey(message.length());
    }

    /**
     * Generates a random key of the same length as the message
     */
    private String generateKey(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char c = (char) (generator.nextInt(32, 126) + 'a'); // generates a random lowercase letter
            sb.append(c);
        }
        return sb.toString();
    }

    /**
     * Replaces the value of message to its encrypted form by applying the XOR cipher encryption algorithm
     */
    public void encrypt() {
        if (!encrypted) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                char c = (char) (message.charAt(i) ^ key.charAt(i%key.length())); // XOR operation between the message character and corresponding key character
                sb.append(c);
            }
            message = sb.toString();
            encrypted = true;
        }
    }

    /**
     * Returns the unencrypted form of the value of message
     */
    public String decrypt() {
        if (encrypted) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                char c = (char) (message.charAt(i) ^ key.charAt(i)); // XOR operation between the encrypted message character and corresponding key character
                sb.append(c);
            }
            message = sb.toString();
            encrypted = false;
        }
        return message;
    }

    /**
     * Returns the value of encrypted
     */
    public boolean isEncrypted() {
        return encrypted;
    }

    /**
     * Returns the value of message
     */
    public String toString() {
        return message;
    }
} // end of AguilarAaronKyleSecret class
