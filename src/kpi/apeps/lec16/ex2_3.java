package kpi.apeps.lec16;

import javax.swing.*;
import java.awt.*;

/**
 * Компоновка панелі за допомогою GridLayout
 */
public class ex2_3 extends JFrame {

    public ex2_3() {
        super("GridLayout");
        setSize(300, 300);
        setLocation(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Додаєм панель і притискаємо її до нижнього краю
        JPanel jPanel = new JPanel();
        add(jPanel,BorderLayout.SOUTH);

        //Визначаємо компоновник як сітку 1х2
        jPanel.setLayout(new GridLayout(1,2,0,10) );

        // Додаємо компоненти в панель (за замовчуванням використовується FlowLayout)
        jPanel.add(new JButton("Ok"));//кнопки однакові за розмірами
        jPanel.add(new JButton("Відмінити"));

        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ex2_3();//створення вікна
            }
        });
    }
}
