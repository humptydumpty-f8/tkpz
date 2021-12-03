package kpi.apeps.lec13;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Менеджер компоновки FlowLayout
 */
public class ex1_1 {
    public static void main(String[] args) {

        //Внутрішній клас методу
        class FlowLayoutDemo extends Frame {

            //Конструктор
            public FlowLayoutDemo(String title) {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                //Установка менеджера для форми і додавання компонентів
                setLayout (new FlowLayout (FlowLayout.CENTER, 10, 10));
                add(new Button("Кнопка"));
                add(new Label("Метка"));
                add(new Checkbox("Выбор"));
                add(new Choice());
                add(new TextField ("Справка", 10));

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
