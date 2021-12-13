package kpi.apeps.lec16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Панель з групою радіокнопок для вибору виду рамки навкруги панелі
 */
public class ex3_4 extends JFrame {

    private JRadioButton etched;
    private JRadioButton line;
    private JRadioButton matte;

    public ex3_4() {
        super("Border On/Off");
        setSize(300, 300);
        setLocation(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Додаєм панель і розміщуємо її по центру форми
        JPanel jPanel = new JPanel();
        add(jPanel, BorderLayout.CENTER);

        // Створюємо групу кнопок JRadioButton
        ButtonGroup group = new ButtonGroup();

        // Створюємо і додаємо JRadioButton-кнопки в групу
        etched = new JRadioButton("Etched", true);
        line = new JRadioButton("Line");
        matte = new JRadioButton("Matte");
        group.add(etched);
        group.add(line);
        group.add(matte);

        // Додаємо JRadioButton в панель
        jPanel.add(etched);
        jPanel.add(line);
        jPanel.add(matte);

        setVisible(true);

        // Обробники подій вибору радіокнопок

        etched.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBorder(BorderFactory.createEtchedBorder());
            }
        });

        line.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBorder(BorderFactory.createLineBorder(new Color(255, 0, 0)));
            }
        });

        matte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, new Color(0, 255, 0)));
            }
        });
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ex3_4();//створення вікна
            }
        });
    }
}
