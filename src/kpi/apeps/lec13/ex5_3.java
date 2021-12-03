package kpi.apeps.lec13;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Менеджер GridBagLayout для панелі
 * з обєднанням комірок
 */
public class ex5_3 {
    public static void main(String[] args) {

        //Внутрішній клас методу
        class GridBagLayoutDemo extends Frame {

            //Конструктор
            public GridBagLayoutDemo(String title) {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                GridBagLayout gbl = new GridBagLayout();// створюємо менеджер
                setLayout(gbl);// встановлюємо його в контейнер
                GridBagConstraints c = new GridBagConstraints();// задаєм правила разміщення за замовчуванням

                Button b1 = new Button("Button 1");// створюємо компонент
                c.gridx  = 0; // змінюєм правила
                add(b1, c); // додаєм компонент b1 в контейнер

                c.gridy  = 1; // змінюєм правила размещения
                c.gridx = GridBagConstraints.RELATIVE;
                Button b2 = new Button("Button 2"); // створюємо компонент
                add(b2, c); // встановлюємо його
                Button b3 = new Button("Button 3"); // створюємо компонент
                add(b3, c); // встановлюємо його

                c.gridy  = 2;// змінюєм правила размещения
                c.gridwidth =2;
                c.fill = GridBagConstraints.HORIZONTAL;
                Button b4 = new Button("Button 4");// створюємо компонент
                add(b4, c);// встановлюємо його

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
        new GridBagLayoutDemo("GridBagLayoutDemo");
    }
}
