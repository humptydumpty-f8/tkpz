package kpi.apeps.lec12;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Додавання елементів в контейнер зза допомогою add з одним параметром
 */
public class ex1_1 extends Frame {

    //Конструктор
    public ex1_1(String title)  {
        super(title);
        setSize(300,200);
        setLocation(200,300);

        //Додавання текстового поля
        TextField textField = new TextField("Password");
        this.add(textField);

        //Додавання кнопки
        Button button = new Button("Ok");
        this.add(button);

        //Відключення менеджера розташування за замовчуванням
        setLayout(null);

        //Позиціювання елементів
        textField.setBounds(100,50,80,30);
        button.setBounds(100,100,80,30);

        //Візуалізація форми
        setVisible(true);
    }

    public static void main(String[] args) {

        Frame frame = new ex1_1("Main");//запуск додатку

        //Обробник кнопки закривання вікна
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
