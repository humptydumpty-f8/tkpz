package kpi.apeps.lec11;

/**
 * Формування основного вікна програми
 */

import java.awt.*;//імпорт класів бібліотеки AWT
//Імпорт класів, що використовуються в обробнику кнопки закривання вікна
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Наслідування класу Frame
public class ex1_1 extends Frame {

    public static void main(String[] args) {

        Frame fr = new ex1_1();//створення вікна
        fr.setSize(300,300);//визначення ненульових розміпів вікна
        fr.setVisible(true);//візуалізація вікна

        //Обробник кнопки закривання вікна
        fr.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
