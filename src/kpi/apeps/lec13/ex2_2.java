package kpi.apeps.lec13;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Менеджер CardLayout для компоновки панелі
 */
public class ex2_2 {
    public static void main(String[] args) {

        //Внутрішній клас методу
        class CardLayoutDemo extends Frame {

            //Конструктор
            public CardLayoutDemo(String title)  {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                //Створення панелі і кнопок навігації
                Panel panel = new Panel();
                Button buttonNext = new Button("Next");
                Button buttonPrev = new Button("Previous");

                //Компоновка панелі і кнопок навігації менеджером форми
                add(BorderLayout.CENTER,panel);
                add(BorderLayout.NORTH,buttonNext);
                add(BorderLayout.SOUTH,buttonPrev);

                //Заміна дефолтного менеджера панелі на CardLayout
                CardLayout cardLayout = new CardLayout(10,20);
                panel.setLayout (cardLayout);
                panel.add(new Label("Card #1"),"pagel");
                panel.add(new Label("Card #2"), "page2");
                panel.add(new Label("Card #3"), "page3");

                setVisible(true);//візуалізація форми

                //Обробник для закривання форми
                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });

                //Обробник для кнопки "Next"
                buttonNext.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cardLayout.next(panel);
                    }
                });

                //Обробник для кнопки "Previous"
                buttonPrev.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cardLayout.previous(panel);
                    }
                });
            }
        }

        //Сценарій роботи
        new CardLayoutDemo("CardLayoutDemo");//відкрити форму
    }
}
