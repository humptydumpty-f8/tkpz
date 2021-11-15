package kpi.apeps.lec10;

import java.util.Scanner;

/**
 * Інтерфейс криптосистеми з реалізацією за замовчуванням метода отримання ключа шифрування
 */
public interface ICipher {

    //Метод шифрування
    void encrypt(String text,String key);

    //Метод розшифрування
    void decrypt(String crypto,String key);

    //Метод з реалізацією за замовчуванням
    default String setKey(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Key = ");
        String key = scn.next();
        scn.close();
        return key;
    }
}
