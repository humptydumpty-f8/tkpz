package kpi.apeps.lec14;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Компонент Button: логування дій
 */
public class ex2_2 {
    public static void main(String[] args) {

        class ButtonDemo extends Frame {

            public ButtonDemo(String title) {
                super(title);
                setSize(400, 300);
                setLocation(200, 300);

                //Створення кнопок і додавання їх на форму
                Button buttonUp = new Button("Up Button");
                Button buttonDown = new Button("Down Button");

                add(buttonUp, BorderLayout.NORTH);
                add(buttonDown, BorderLayout.SOUTH);

                pack();//упаковка компонентів

                setVisible(true);//візуалізація форми

                //Обробник кнопки закривання форми
                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });

                //Обробник натиснення кнопки buttonUp
                buttonUp.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("It was pressed: " + buttonUp.getLabel());
                    }
                });

                //Обробник натиснення кнопки buttonDown
                buttonDown.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("It was pressed: " + buttonDown.getLabel());
                    }
                });
            }
        }

        //Сценарій роботи
        new ButtonDemo("ButtonDemo");//відкрити форму
    }
}
