package kpi.apeps.lec12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Контейнер Dialog і Panel
 * Діалог відкривається при натисненні кнопки.
 * В ньому розміщується панель з кнопками ОК і Console
 */
public class ex5_1 {

    public static void main(String[] args) {

        //Клас головного вікна
        class FrameDemo extends Frame {

            //Конструктор
            public FrameDemo() {
                super("FrameDemo");
                setSize(300,200);
                setLocation(200,300);

                Button btn = new Button("Show dialog");//кнопка виклику діалога
                add("South",btn);
                setBackground(Color.darkGray);
                setForeground(Color.black);

                // Обробник події кліку по кнопці
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new FrameDemo.DialogDemo();
                    }
                });

                setVisible(true);
            }

            //Внутрішній клас діалогу
            class DialogDemo{
                public DialogDemo() {
                    Dialog d = new Dialog(FrameDemo.this,"Modal dialog",false);
                    d.setSize(400,300);
                    d.setLocation(400,300);
                    setForeground(Color.black);

                    //Створення панелі з кнопками
                    Panel inPanel = new Panel();
                    Button btnOk = new Button("OK");
                    Button btnConsole = new Button("Console");
                    inPanel.add(btnOk);// додавання кнопки в панель
                    inPanel.add(btnConsole);// додавання кнопки в панель
                    d.add(inPanel,BorderLayout.SOUTH);// додавання панелі в діалогове вікно


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

        FrameDemo frame = new FrameDemo();//відкривання головного вікна

        //Обробник події кліку по кнопці закриття головного вікна
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
