package kpi.apeps.lec16;

import javax.swing.*;
import java.awt.*;

/**
 * Компоновка панелі за допомогою FlowLayout
 */
public class ex2_2 extends JFrame {

    public ex2_2() {
        super("FlowLayout");
        setSize(300, 300);
        setLocation(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Додаєм панель і притискаємо її до верхнього краю
        JPanel jPanel = new JPanel();
        add(jPanel,BorderLayout.NORTH);

        // Додаємо компоненти в панель (за замовчуванням використовується FlowLayout)
        jPanel.add(new JButton("Command1"));
        jPanel.add(new JButton("Command2"));
        jPanel.add(new JButton("Command3"));

        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ex2_2();//створення вікна
            }
        });
    }
}
