package kpi.apeps.lec12;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Контейнер Frame
 */
public class ex3_1  {

    public static void main(String[] args) {

        //Внутрішній клас методу
        class FrameDemo extends Frame {

            // Конструктор
            public FrameDemo() {
                super("FrameDemo");// заголовок
                setSize(300,200);//розміри
                setLocation(200,300);//розташування

                //Додавання рознокольорової мітки
                Label lbl = new Label("Frame Demo", Label.CENTER);
                add(lbl, BorderLayout.CENTER);
                setBackground(Color.darkGray);
                setForeground(Color.yellow);

                //Створення командного меню
                MenuBar mbMainMenuBar = new MenuBar();
                Menu mnFile = new Menu("File");
                mnFile.add("New");
                mnFile.add("-");
                mnFile.add("Exit");
                mbMainMenuBar.add(mnFile);
                setMenuBar(mbMainMenuBar);

//        pack();// автоупаковка
                setVisible(true);//відобразити
            }
        }

        //Сценарій роботи
        FrameDemo frame = new FrameDemo();
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
