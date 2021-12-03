package kpi.apeps.lec13;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Менеджер GridLayout для компоновки кнопок калькулятора
 */
public class ex4_1 {
    public static void main(String[] args) {

        //Внутрішній клас методу
        class GridLayoutDemo extends Frame {

            //Конструктор
            public GridLayoutDemo(String title) {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                //Перевизначення дефолтного менеджера форми на GridLayout
                setLayout(new GridLayout(4, 4, 5, 5));//таблиця 4х4 з відступами по 5 пікселів
                String st = new String("789/456*123-0.=+");//радок для написів на кнопках
                for (char c : st.toCharArray()){add(new Button(Character.toString(c)));}//додавання кнопок на форму

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
