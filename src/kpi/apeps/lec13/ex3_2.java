package kpi.apeps.lec13;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Комбінування менеджерів BorderLayout з FlowLayout
 */
public class ex3_2 {
    public static void main(String[] args) {

        //Внутрішній клас методу
        class BorderLayoutDemo extends Frame {

            //Конструктор
            public BorderLayoutDemo(String title) {
                super(title);
                setSize(300, 200);
                setLocation(200, 300);

                //Створення двох панелей і розміщення їх на формі дефолтним менеджером
                Panel panelUp = new Panel();
                Panel panelDn = new Panel();
                add(panelUp, BorderLayout.NORTH);
                add(panelDn, BorderLayout.SOUTH);
                add((new Label("Workspace",Label.CENTER)));

                //Розміщення кнопок в панелях дефолтним менеджером
                panelUp.add(new Button("cmd1"));
                panelUp.add(new Button("cmd2"));
                panelUp.add(new Button("cmd3"));

                panelDn.add(new Button("OK"));
                panelDn.add(new Button("Console"));

                setVisible(true);//візуалізація форми

                //Обробник для закривання форми
                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
            }
        }

        //Сценарій роботи
        new BorderLayoutDemo("BorderLayoutDemo");
    }
}
