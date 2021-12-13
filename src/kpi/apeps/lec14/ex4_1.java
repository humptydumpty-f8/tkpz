package kpi.apeps.lec14;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Компонент Choice
 */
public class ex4_1 {
    public static void main(String[] args) {

        class ChoiceDemo extends Frame {
            public ChoiceDemo(String title) throws HeadlessException {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                Label label = new Label();

                //Створюємо пустий список і додаєм пункти
                Choice ch = new Choice();
                ch.add("One");
                ch.add("Two");
                ch.add("Three");
                ch.select(1);

                label.setText(ch.getSelectedItem());//установка початкового значення мітки

                add(ch,BorderLayout.CENTER);
                add(label,BorderLayout.SOUTH);

                pack();//упаковка компонентів

                setVisible(true);//візуалізація форми

                //Обробник вибору елемента списку
                ch.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        label.setText(ch.getSelectedItem());
                    }
                });

                //Обробник кнопки закривання форми
                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
            }
        }

        //Сценарій роботи
        new ChoiceDemo("ChoiceDemo");
    }
}
