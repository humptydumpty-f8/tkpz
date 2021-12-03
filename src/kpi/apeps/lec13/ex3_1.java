package kpi.apeps.lec13;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Менеджер BorderLayout для компоновки вікна
 */
public class ex3_1 {
    public static void main(String[] args) {

        //Внутрішній клас методу
        class BorderLayoutDemo extends Frame {

            //Конструктор
            public BorderLayoutDemo(String title)  {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                //Розміщення компонентів на формі дефолтним менеджером - BorderLayout
                add(new Button("North"),BorderLayout.NORTH);
                add(new Button("South"), BorderLayout.SOUTH);
                add(new Button("West"), BorderLayout.WEST);
                add(new Button("East"), BorderLayout.EAST);
                add(new Button("Center"));

                setVisible(true);//візуалізація форми

                //Обробник для закривання форми
                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
            }
        }

        //Сценарій роботи
        new BorderLayoutDemo("BorderLayoutDemo");//відкри форму
    }
}
