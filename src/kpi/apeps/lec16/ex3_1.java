package kpi.apeps.lec16;

import javax.swing.*;
import java.awt.*;

/**
 * Компонент JLabel і JButton з іконкою
 */
public class ex3_1 extends JFrame {

    public ex3_1() {
        super("Icons in components");
        setSize(300, 300);
        setLocation(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Додаєм панель і розміщуємо її до по центру
        JPanel jPanel = new JPanel();
        add(jPanel,BorderLayout.CENTER);

        //Визначаємо компоновник як сітку 2х4
        jPanel.setLayout(new GridLayout(2,2,10,10) );

        // Додаємо компоненти в панель
        jPanel.add(new JLabel("Мітка з іконкою:",JLabel.CENTER));//мітка з текстом
        jPanel.add(new JLabel("Голуб",new ImageIcon("Icons/icons8-голубь-48.png"),JLabel.RIGHT));//мітка з іконкою і текстом
        jPanel.add(new JLabel("Кнопка з іконкою:",JLabel.RIGHT));
        jPanel.add(new JButton("Голуб",new ImageIcon("Icons/icons8-голубь-48.png")));//кнопка з іконкою і текстом

        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ex3_1();//створення вікна
            }
        });
    }
}
