package kpi.apeps.lec12;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Контейнер Window
 */
public class ex2_1 extends Frame {

    //Конструктор
    public ex2_1(String title) {
        super(title);
        setSize(300, 200);
        setLocation(200, 300);
        setVisible(true);
    }

    public static void main(String[] args) {

        // Створення батьківського фрейму
        Frame frame = new ex2_1("Container Window");

        //Створення контейнеру Window
        Window w = new Window(frame);
        w.setSize(100, 100);
        w.setLocation(400, 400);
        w.toFront();//на передній план
        w.setBackground(Color.GREEN);//колір фону
        w.setVisible(true);//візуалізувати (альтернатива застарілому show)
        // w.show();

        System.out.println("Window is showing: " + w.isShowing());//стан видимості
        try {
            Thread.sleep(5 * 1000);
            frame.setVisible(false);//приховати (альтернатива застарілому hide)
            //w.hide();
        } catch (InterruptedException e) {
        }

        System.out.println("Window is showing: " + w.isShowing());//стан видимості

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
