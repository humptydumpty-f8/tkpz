package kpi.apeps.lec12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * Контейнер Dialog і Panel
 * Діалог відкривається при натисненні кнопки.
 * В ньому розміщуються панелі з менеджером компоновки з замовчуванням і з вибраним.
 * Перший використовується для розміщення кнопок ОК і Console, другий - для чекбоксів
 */
public class ex5_2 {


    public static void main(String[] args) {

        //Клас головного вікна
        class FrameDemo extends Frame {

            //Конструктор
            public FrameDemo() {
                super("FrameDemo");
                setSize(300,200);
                setLocation(200,300);

                Button btn = new Button("Show dialog");//кнопка виклику діалога
                add(BorderLayout.SOUTH,btn);
                setBackground(Color.darkGray);
                setForeground(Color.black);

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
                    d.setSize(300,200);
                    d.setLocation(400,300);
                    setForeground(Color.black);

                    //Панель з менеджером розташування за замовчуванням FlowLayout
                    Panel inPanel = new Panel();
                    Button btnOk = new Button("OK");
                    Button btnConsole = new Button("Console");
                    inPanel.add(BorderLayout.SOUTH,btnOk);
                    inPanel.add(btnConsole);
                    d.add(inPanel,BorderLayout.SOUTH);//задаємо розташування панелі в діалозі

                    //Панель з заміненим менеджером розташування BorderLayout
                    Panel chckPanel = new Panel(new BorderLayout());
                    Checkbox checkbox1 = new Checkbox("Chk1");
                    chckPanel.add(checkbox1,BorderLayout.NORTH);
                    Checkbox checkbox2 = new Checkbox("Chk2");
                    chckPanel.add(checkbox2,BorderLayout.SOUTH);
                    Checkbox checkbox3 = new Checkbox("Chk3");
                    chckPanel.add(checkbox3,BorderLayout.CENTER);
                    d.add(chckPanel,BorderLayout.CENTER);//задаємо розташування панелі в діалозі

                    d.add(BorderLayout.NORTH, new Label("Checkbox Panel"));//додаємо мітку в діалог

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
