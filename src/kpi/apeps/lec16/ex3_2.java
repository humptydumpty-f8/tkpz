package kpi.apeps.lec16;

import javax.swing.*;
import java.awt.*;

/**
 * Компонент JLabel і JButton з HTML
 */
public class ex3_2 extends JFrame {

    public ex3_2() {
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
        jPanel.add(new JLabel("<html><i>Мітка</i> з фоном:</html>",JLabel.CENTER));//мітка з текстом
        jPanel.add(new JLabel("<html><p bgcolor = \"#006d93\" ><font color=\"white\">Білий текст на фоні</html>"));//мітка з фоном і текстом
        jPanel.add(new JLabel("<html>Кнопка з <u>фоном:</u></html>",JLabel.CENTER));
        jPanel.add(new JButton("<html><p bgcolor = \"#006d93\" ><font color=\"white\">Білий текст на фоні</html>"));//кнопка з фоном і текстом

        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ex3_2();//створення вікна
            }
        });
    }
}
