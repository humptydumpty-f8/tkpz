package kpi.apeps.lec13;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Менеджер GridBagLayout для панелі ауторизації
 * з відносним розміщенням компонентів
 */
public class ex5_4 {
    public static void main(String[] args) {

        //Внутрішній клас методу
        class GridBagLayoutDemo extends Frame {

            //Конструктор
            public GridBagLayoutDemo(String title) {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                GridBagLayout gbl = new GridBagLayout();//створюємо менеджер
                setLayout(gbl);// встановлюємо його в контейнер
                GridBagConstraints c = new GridBagConstraints();// задаєм правила разміщення за замовчуванням

                c.gridx  = 0;// змінюєм правила размещения
                c.gridy  = 0;
                c.gridx = GridBagConstraints.RELATIVE;
                Label login = new Label("Login: ");// створюємо компонент
                TextField tLogin = new TextField("Login");
                add(login, c);//додаємо в контейнер
                add(tLogin, c);

                c.gridy  = 1;// змінюєм правила размещения
                c.gridx = GridBagConstraints.RELATIVE;
                Label pasword = new Label("Pasword: ");// створюємо компонент
                TextField tPasword = new TextField("Pasword");
                add(pasword, c);//додаємо в контейнер
                add(tPasword, c);

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
        new GridBagLayoutDemo("GridBagLayoutDemo");
    }
}
