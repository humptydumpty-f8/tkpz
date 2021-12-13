package kpi.apeps.lec16;

import javax.swing.*;
import java.awt.*;

/**
 * Компоновка вікна за допомогою BorderLayout
 */
public class ex2_1 extends JFrame {

    public ex2_1() {
        super("BorderLayout");
        setSize(300, 300);
        setLocation(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Додаємо компоненти
        add(new JButton("Север"), "North");//параметр-рядок
        add(new JButton("Юг"), "South");
        add(new JLabel("Запад"), BorderLayout.WEST);//параметр-константа
        add(new JLabel("Восток"), BorderLayout.EAST);
        add(new JButton("Центр"));//параметр не вказаний

        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ex2_1();//створення вікна
            }
        });
    }
}
