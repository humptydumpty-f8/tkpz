package kpi.apeps.lec11;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Опис властивостей вікна раціональніше визначати з допомогою конструктора
 */

//Наслідування класу Frame
public class ex1_2 extends Frame {

    //Конструктор
    public ex1_2()  {
        super("Main");
        setSize(300,300);
        setVisible(true);

        //Обробник кнопки закривання вікна
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        new ex1_2();//запуск додатку
    }
}
