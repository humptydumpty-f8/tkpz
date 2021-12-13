package kpi.apeps.lec14;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * Компонент List: прості операції
 */
public class ex5_2 {
    public static void main(String[] args) {

        class ListDemo extends Frame {
            public ListDemo(String title) {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                GridLayout gridLayout = new GridLayout();
                gridLayout.setColumns(1);
                gridLayout.setRows(2);
                gridLayout.setVgap(10);
                gridLayout.setHgap(20);
                setLayout (gridLayout);

                //Створення списку
                List ls = new List(3,true);
                ls.add("Диван");
                ls.add("Чемодан");
                ls.add("Саквояж");
                ls.select(0);//вибір за замовчуванням

                Panel panel1 = new Panel();
                Panel panel2 = new Panel();//панель з кнопками операцій
                add(panel1);
                add(panel2);

                Label label = new Label("Добавить:");
                TextField textField = new TextField("    ");
                Button buttonAdd = new Button("Add");
                Button buttonRmv = new Button("Rmv");
                Button buttonRmvAll = new Button("RmvAll");

                panel1.add(new Label("Дама сдавала в багаж:"));
                panel1.add(ls);
                panel1.add(label);
                panel1.add(textField);
                panel2.add(buttonAdd);
                panel2.add(buttonRmv);
                panel2.add(buttonRmvAll);

                pack();

                setVisible(true);

                //Обробник кнопки додавання елементів в список
                buttonAdd.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ls.add(textField.getText());
                        textField.setText("   ");
                    }
                });

                //Обробник кнопки видалення виділеного елементу
                buttonRmv.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ls.remove(ls.getSelectedItem());
                    }
                });

                //Обробник кнопки для видалення всіх елементів
                buttonRmvAll.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ls.removeAll();
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
