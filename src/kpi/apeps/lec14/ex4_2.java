package kpi.apeps.lec14;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Компонент Choice: прості операції
 */
public class ex4_2 {
    public static void main(String[] args) {

        class ChoiceDemo extends Frame {
            public ChoiceDemo(String title) throws HeadlessException {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                GridLayout gridLayout = new GridLayout();
                gridLayout.setColumns(1);
                gridLayout.setRows(2);
                gridLayout.setVgap(10);
                gridLayout.setHgap(20);
                setLayout (gridLayout);

                //Створюємо пустий список і додаєм пункти
                Choice ch = new Choice();
                ch.add("One");
                ch.add("Two");
                ch.add("Three");
                ch.select(1);

                Panel panel1 = new Panel();//панель для списку і текстового поля
                Panel panel2 = new Panel();//панель з кнопками операцій
                add(panel1);
                add(panel2);

                Label label = new Label("New:");
                TextField textField = new TextField("    ");
                Button buttonAdd = new Button("Add");
                Button buttonRmv = new Button("Rmv");
                Button buttonRmvAll = new Button("RmvAll");

                panel1.add(ch);
                panel1.add(label);
                panel1.add(textField);
                panel2.add(buttonAdd);
                panel2.add(buttonRmv);
                panel2.add(buttonRmvAll);

                pack();//упаковка компонентів

                setVisible(true);//візуалізація форми

                //Обробник кнопки додавання елементів в список
                buttonAdd.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ch.add(textField.getText());
                        textField.setText("   ");
                    }
                });

                //Обробник кнопки видалення виділеного елементу
                buttonRmv.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ch.remove(ch.getSelectedItem());
                    }
                });

                //Обробник кнопки для видалення всіх елементів
                buttonRmvAll.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ch.removeAll();
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
