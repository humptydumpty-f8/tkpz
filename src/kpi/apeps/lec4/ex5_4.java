package kpi.apeps.lec4;

/**
 * Шифрування методом Цезаря
 */
public class ex5_4 {
    public static void main(String[] args) {

        String message = "Hello";
        StringBuffer cryptoText = new StringBuffer();
        System.out.println("Before:\n" +
                message);
        int key = 4;
//Encription
        for (int i = 0; i < message.length(); i++) {
            cryptoText.append((char) (message.charAt(i)+key));
        }

        System.out.println("After:\n" +
                cryptoText);
    }
//    todo: Write decryption code
}

