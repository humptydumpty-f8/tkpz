package kpi.apeps.lec13;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Стандартні менеджер компоновки в різних контейнерах:
 * FlowLayout для Panel, BorderLayout для Frame
 */
public class ex1_2 {
    public static void main(String[] args) {

        //Внутрішній клас методу
        class FlowLayoutDemo extends Frame {

            //Конструктор
            public FlowLayoutDemo(String title) {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                //Створення панелі і розміщення в ній компонентів
                Panel panel = new Panel(); //стандартний менеджер компоновки FlowLayout
                panel.add(new Button("Кнопка"));
                panel.add(new Label("Метка"));
                panel.add(new Checkbox("Выбор"));
                panel.add(new Choice());
                panel.add(new TextField ("Справка", 10));

                //Додавання панелі на форму
                add("North",panel);//стандартний менеджер компоновки BorderLayout

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
