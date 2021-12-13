package kpi.apeps.lec14;

import java.awt.*;
import java.awt.event.*;

/**
 * Побудова меню команд
 */
public class ex8_1 {
    public static void main(String[] args) {

        class MenuDemo extends Frame {
            public MenuDemo(String title) {
                super(title);
                setSize(300, 200);
                setLocation(200, 300);

                // Создаем полосу меню
                MenuBar menuBar = new MenuBar();
                setMenuBar(menuBar);

                // Создаем первое меню
                Menu menu1 = new Menu("Menu 1");
                menuBar.add(menu1);

                // Создать и добавить первый пункт  первого меню
                MenuItem item1_1 = new MenuItem("Item #1");// Это обычный элемент меню
                menu1.add(item1_1);

                // Создать и добавить второй пункт  первого меню
                CheckboxMenuItem item1_2 = new CheckboxMenuItem("Item #2", true);// Это отмечаемый элемент меню
                menu1.add(item1_2);

                // Создать и добавить второе меню
                Menu menu2 = new Menu("Menu 2");
                menuBar.add(menu2);

                // Создать и добавить меню  следующего уровня
                Menu nextLevel = new Menu("Next Level Menu");
                menu2.add(nextLevel);
                MenuItem item2_1 = new MenuItem("Item #2_1");
                nextLevel.add(item2_1);

                pack();
                setVisible(true);

                //Обробник вибору пункту "Item #1"
                item1_1.addActionListener(new CommandViewer());
                item1_2.addItemListener(new ItemListener() {
                                            @Override
                                            public void itemStateChanged(ItemEvent e) {
                                                System.out.println("Command " + e.getSource().toString());
                                            }
                                        }
                );
                item2_1.addActionListener(new CommandViewer());

                //Обробник кнопки закривання форми
                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
            }

            //Вкладений клас слухача
            class CommandViewer implements ActionListener {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Command " + e.getSource().toString());
                }
            }
        }

        //Сценарій роботи
        new MenuDemo("MenuDemo");
    }
}
