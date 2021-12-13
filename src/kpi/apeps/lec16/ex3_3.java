package kpi.apeps.lec16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Компонент з рамкою, яка вмикається/вимикається чекбоксом
 */
public class ex3_3 extends JFrame {

    private JCheckBox onBorder;

    public ex3_3() {
        super("Border On/Off");
        setSize(300, 300);
        setLocation(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Додаєм панель і розміщуємо її по верхньому краю
        JPanel jPanel = new JPanel();
        add(jPanel, BorderLayout.NORTH);

        // Додаємо JCheckBox в панель
        onBorder = new JCheckBox("On/Off");
        jPanel.add(onBorder);

        setVisible(true);

        // Додаємо обробник кліку по чекбоксу, який вмикає/вимикає рамку навкруги панелі jPanel
        onBorder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (onBorder.isSelected() == true) jPanel.setBorder(BorderFactory.createEtchedBorder());
                else jPanel.setBorder(BorderFactory.createEmptyBorder());
            }
        });
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ex3_3();//створення вікна
            }
        });
    }
}
