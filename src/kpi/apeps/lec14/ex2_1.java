package kpi.apeps.lec14;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Компонент Button з підрахунком кількості кліків
 */
public class ex2_1 {
    public static void main(String[] args) {

        class ButtonDemo extends Frame {

            static private int counter = 0;//лічильник натискань

            public ButtonDemo(String title)  {
                super(title);
                setSize(400, 300);
                setLocation(200, 300);

                //Створення компонента Button і додавання його на форму
                Button button = new Button();
                button.setLabel("Click me!");// початковий напис
                add(button, BorderLayout.CENTER);

                pack();//упаковка компонентів

                setVisible(true);//візуалізація форми

                //Обробник кнопки закривання форми
                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });

                //Обробник натиснення кнопки з використанням анонімного класу
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        button.setLabel(++counter + " click");//новий напис
                    }
                });
            }
        }

        //Сценарій роботи
        new ButtonDemo("ButtonDemo");//відкрити форму
    }
}
