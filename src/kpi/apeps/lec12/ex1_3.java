package kpi.apeps.lec12;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Додавання елементів в контейнер зза допомогою add з двома параметрами
 * з тяжінням до сторін
 */
public class ex1_3 extends Frame {
    static Button button;

    //Конструктор
    public ex1_3(String title) {
        super(title);
        setSize(300, 200);
        setLocation(200, 300);

        button = new Button("Click me!");
        Button button1 = new Button("North");
        Button button2 = new Button("South");
        Button button3 = new Button("West");
        Button button4 = new Button("East");
        Button button5 = new Button("North-East!");

        this.add(button);
        this.add("North", button1);
        this.add("South", button2);
        this.add("West", button3);
        this.add("East", button4);
        this.add(button5);//перекриває button

        setVisible(true);
    }

    public static void main(String[] args) {

        Frame frame = new ex1_3("Main");
//        frame.remove(1);
//        frame.remove(button);
//        frame.add(new Button("Ok"));

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
