package kpi.apeps.lec12;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Програма з динамічним інтерфейсом
 * Кнопки додаються і видаляються з форми
 */
public class ex1_4 extends Frame {
    static Button button;
    static final String[] directions = {"North", "East", "South", "West"};//Масив напрямків

    //Конструктор
    public ex1_4(String title) {
        super(title);
        setSize(300, 200);
        setLocation(200, 300);
    }

    public static void main(String[] args) {

        Frame frame = null;
        try {
            frame = new ex1_4("Removable buttons");//задаємо заголовок вікна
            for (String direct : directions) {
                button = new Button(direct);
                frame.add(direct, button);//додавання кнопки і візуалізація
                frame.setVisible(true);
                //Часова затримка 3 сек
                Thread.sleep(3_000);//викидає InterruptedException
                frame.remove(button);//видалення кнопки
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //todo: Modify the code so that first four buttons are added with a delay, and then all are removed

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
