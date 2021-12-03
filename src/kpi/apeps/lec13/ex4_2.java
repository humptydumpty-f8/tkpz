package kpi.apeps.lec13;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Менеджер GridLayout:
 * Нульова кількість рядків чи стовпців означає, що менеджер сам створить необхідне їх число
 */
public class ex4_2 {
    public static void main(String[] args) {

        //Внутрішній клас методу
        class GridLayoutDemo extends Frame {

            //Конструктор
            public GridLayoutDemo(String title) {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                //Перевизначення дефолтного менеджера форми на GridLayout
                setLayout(new GridLayout(3, 0));//менеджер сам визначає кількість колонок

                for (int i=0; i<17; i++){add(new Label(Integer.toString(i)));}//додавання нумерованих міток

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
        new GridLayoutDemo("GridLayoutDemo");
    }
}
