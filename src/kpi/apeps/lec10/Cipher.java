package kpi.apeps.lec10;

/**
 * Абстрактний клас шифра
 */
public abstract class Cipher {

    protected String key;//Ключ шифрування
    abstract void encrypt(String plainText);//Абстрактний метод для шифрування
    abstract void decrypt(String cryptoText);//Абстрактний метод для розшифрування

    //Конструктор
    public Cipher(String key) {
        this.key = key;
    }

    //Гетер ключа
    String getKey(){return this.key;}
}
