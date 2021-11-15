package kpi.apeps.lec10;

/**
 * Схема реалізації конкретного методу шифрування
 */
public class ex1_3 {
    public static void main(String[] args) {

        //Клас-спадкоємець
        class Caeser extends Cipher {

            //Конструтор
            public Caeser(String key) {
                super(key);
            }

            //Визначення методу шифрування
            @Override
            void encrypt(String plainText) {
                System.out.println("Text \"" + plainText +
                        "\" was encrypted with key \"" + this.key + "\"");
            }

            //Визначення методу розшифрування
            @Override
            void decrypt(String cryptoText) {
                System.out.println("Cryptotext \"" + cryptoText +
                        "\" was decrypted with key \"" + this.key + "\"");
            }
        }

        //Сценарій використання
        Caeser caeser = new Caeser("password");
        caeser.encrypt("Plain text");
        caeser.decrypt("Crypto text");
    }
}
