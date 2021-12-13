package kpi.apeps.lec14;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Компонент Checkbox: зчитування стану прапорця
 */
public class ex3_1 {
    public static void main(String[] args) {

        class CheckboxDemo extends Frame {
            public CheckboxDemo(String title)  {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                //Створення компонентів і додавання їх на форму
                Checkbox checkbox = new Checkbox("Checkbox", true);
                Label label = new Label(" ");
                add(checkbox,"Center");
                add(label, "South");

                pack();//упаковка компонентів

                setVisible(true);//візуалізація форми

                //Обробник кліку по прапорцю
                checkbox.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        label.setText(Boolean.toString(checkbox.getState()));
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
        new CheckboxDemo("CheckboxDemo");//відкрити форму
    }
}
