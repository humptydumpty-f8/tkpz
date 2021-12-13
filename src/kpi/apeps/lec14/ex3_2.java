package kpi.apeps.lec14;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * Група компонентів Checkbox: зчитування стану
 */
public class ex3_2 {
    public static void main(String[] args) {

        class CheckboxDemo extends Frame {

            private Checkbox checkbox1;
            private Checkbox checkbox2;
            private Checkbox checkbox3;
            private Label label;

            public CheckboxDemo(String title)  {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                //Створення таблиці 4х1
                GridLayout gridLayout = new GridLayout();
                gridLayout.setColumns(1);
                gridLayout.setRows(4);
                gridLayout.setVgap(10);
                gridLayout.setHgap(20);
                setLayout (gridLayout);

                //Створення групи прапорців і їх додавання в таблицю
                CheckboxGroup group = new CheckboxGroup();
                checkbox1 =new Checkbox("#1",false,group);
                checkbox2 =new Checkbox("#2",true,group);
                checkbox3 =new Checkbox("#3",false,group);
                add(checkbox1);
                add(checkbox2);
                add(checkbox3);

                //Створення мітки і її додавання в таблицю
                label = new Label();
                label.setAlignment(Label.CENTER);
                label.setBackground(new Color(255,255,0));
                add(label);

                label.setText(group.getSelectedCheckbox().getLabel());//установка початкового значення мітки

                pack();//упаковка компонентів

                setVisible(true);//візуалізація форми

                //Обробник кнопки закривання форми
                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });

                //Створення спільного слухача і призначення його різним прапорцям для запобігання дублювання коду
                ItemListener itemListener = new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        label.setText(group.getSelectedCheckbox().getLabel());
                    }
                };

                checkbox1.addItemListener(itemListener);
                checkbox2.addItemListener(itemListener);
                checkbox3.addItemListener(itemListener);

                /*
                //НЕ раціональний варіант використання обробників
                //Обробник для прапорця checkbox1
                checkbox1.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        label.setText(group.getSelectedCheckbox().getLabel());
                    }
                });
                //Обробник для прапорця checkbox2
                checkbox2.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        label.setText(group.getSelectedCheckbox().getLabel());
                    }
                });
                //Обробник для прапорця checkbox3
                checkbox3.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        label.setText(group.getSelectedCheckbox().getLabel());
                    }
                });
                */
            }
        }

        //Сценарій роботи
        new CheckboxDemo("CheckboxDemo");
    }
}
