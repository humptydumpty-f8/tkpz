package kpi.apeps.lec13;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Розташування компонентів у вигляді стовпчика
 * Використовуються вкладені панелі з перевизначеними компоновниками
 */
public class ex1_3 {
    public static void main(String[] args) {

        //Внутрішній клас методу
        class FlowLayoutDemo extends Frame {

            //Конструктор
            public FlowLayoutDemo(String title) throws HeadlessException {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                //Створення основної панелі
                Panel panel = new Panel();
                panel.setLayout(new BorderLayout());//перевизначення компоновника

                //Створення допоміжної панелі і розміщення в ній компонентів
                Panel panel1 = new Panel();
                panel1.setLayout(new BorderLayout());//перевизначення компоновника
                panel1.add(BorderLayout.NORTH,new Checkbox("Выбор"));
                panel1.add(BorderLayout.CENTER,new Choice());
                panel1.add(BorderLayout.SOUTH,new TextField ("Справка", 10));

                //Вкладення допоміжної панелі
                panel.add(BorderLayout.NORTH,panel1);

                //Додавання основної панелі на форму
                add("West",panel);

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
        new FlowLayoutDemo("FlowLayoutDemo");//відкрити форму
    }
}
