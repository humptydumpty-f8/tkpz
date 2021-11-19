package kpi.apeps.lec12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Контейнер Dialog
 */
public class ex4_1 {

    public static void main(String[] args) {

        //Головне вікно програми
        class FrameDemo extends Frame {

            public FrameDemo() {
                super("DialogDemo");
                setSize(300, 200);
                setLocation(200, 300);

                Label lbl = new Label("Frame Demo", Label.CENTER);
                add(lbl);
                setBackground(Color.darkGray);
                setForeground(Color.yellow);

                setVisible(true);
            }

            //Внутрішній клас діалогового вікна
            class DialogDemo {
                public DialogDemo() {
                    Dialog d = new Dialog(FrameDemo.this, "Modal dialog", false);//створення модального вікна
                    d.setSize(200, 100);
                    d.setLocation(400, 300);
                    setForeground(Color.black);

                    //Додаєм компоненти
                    Label label = new Label("Діалог буде закритий!");//мітка
                    d.add("Center", label);
                    Button btn = new Button("OK");//кнопка ОК
                    d.add("South", btn);

                    //Обробник події кліку по ОК
                    btn.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            d.setVisible(false);
                            d.dispose();
                        }
                    });

                    //Обробник події кліку по кнопці закриття діалогу
                    d.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosing(WindowEvent e) {
                            d.setVisible(false);
                            d.dispose();
                        }
                    });

                    d.setVisible(true);
                }
            }
        }

        //Сценарій роботи програми
        FrameDemo frame = new FrameDemo();//відкривання головного вікна
        frame.new DialogDemo();//відкривання діалогового вікна

        //Обробник події кліку по кнопці закриття головного вікна
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
