package kpi.apeps.lec10;

/**
 * Організація бібліотеки шифрів на основі статичних вкладених класів
 */

//Зовнішній клас
class CryptoAlgorithms {

    //Статичний вкладений клас з реалізацією метода Цезаря
    static class Caesar{
        void encrypt(){
            System.out.println( "Caesar: The text has been encrypted!");
        }
        void decrypt(){
            System.out.println("Caesar: Cryptotext has been decrypted!");
        }
    }

    //Статичний вкладений клас з реалізацією метода Тритеміуса
    static class Tritemius {
        void encrypt(){
            System.out.println("Tritemius: The text has been encrypted!");
        }
        void decrypt(){
            System.out.println("Tritemius: Cryptotext has been decrypted!");
        }
    }
    // TODO: Add other cipher classes
}

public class ex3_3 {
    public static void main(String[] args) {

        //Шифрування/розшифрування методом Цезаря
        CryptoAlgorithms.Caesar caesar = new CryptoAlgorithms.Caesar();
        caesar.encrypt();
        caesar.decrypt();

        //Шифрування/розшифрування методом Тритеміуса
        CryptoAlgorithms.Tritemius tritemius = new CryptoAlgorithms.Tritemius();
        tritemius.encrypt();
        tritemius.decrypt();
    }
}
