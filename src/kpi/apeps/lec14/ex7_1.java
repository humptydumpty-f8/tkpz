package kpi.apeps.lec14;

import java.awt.*;
import java.awt.event.*;

/**
 * Компонент TextField з маскою для приховування введеного тексту
 * Маска включається/виключається за допомогою прапорця
 */
public class ex7_1 {
    public static void main(String[] args) {

        class TextFieldDemo extends Frame {
            public TextFieldDemo(String title) throws HeadlessException {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                //Створюємо прапорець
                Checkbox checkbox = new Checkbox("Hide password",true);

                //Створюємо текстове поле
                TextField textField = new TextField(10);
                textField.setText("pa$vvord");
                if(checkbox.getState()) textField.setEchoChar('#');

                add(checkbox,"North");
                add(textField,"Center");

                pack();
                setVisible(true);

                //Обробник кліку по прапорцю
                checkbox.addItemListener(new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                      if(checkbox.getState()) textField.setEchoChar('#');//установка маски
                      else textField.setEchoChar((char)0);//відміна маски
                    }
                });

                //Обробник кнопки закривання форми
                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
            }
        }

        //Сценарій роботи
        new TextFieldDemo("TextFieldDemo");
    }
}
