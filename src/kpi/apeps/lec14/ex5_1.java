package kpi.apeps.lec14;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

/**
 * Компонент List: вибір елемента списку
 */
public class ex5_1 {
    public static void main(String[] args) {

        class ListDemo extends Frame {
            public ListDemo(String title)  {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                Label label = new Label();

                //Створення списку з множинним вибором
                List ls = new List(3,true);
                ls.add("Диван");
                ls.add("Чемодан");
                ls.add("Саквояж");
                ls.select(0);

                add(new Label("Дама сдавала в багаж:"),BorderLayout.NORTH);
                add(ls,BorderLayout.CENTER);
                label.setText(ls.getSelectedItem());
                add(label,BorderLayout.SOUTH);

                pack();

                setVisible(true);

                //Обробник вибору елементів
                ls.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {

                        label.setText(Arrays.toString(ls.getSelectedItems()));
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
        new ListDemo("ListDemo");
    }
}
