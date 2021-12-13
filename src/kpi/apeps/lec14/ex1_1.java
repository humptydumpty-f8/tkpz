package kpi.apeps.lec14;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Компонент Label: основні можливості
 * Колір тексту і фону спадкується від Component
 */
public class ex1_1 {
    public static void main(String[] args) {

        class LabelDemo extends Frame {

            public LabelDemo(String title) {
                super(title);
                setSize(300, 200);
                setLocation(200, 300);

                //Створення таблиці 3х1 для розміщення міток
                GridLayout gridLayout = new GridLayout();
                gridLayout.setColumns(1);
                gridLayout.setRows(3);
                gridLayout.setVgap(10);
                gridLayout.setHgap(20);
                setLayout(gridLayout);

                //Створення мітки конструктором без параметрів
                Label labelUp = new Label();
                labelUp.setText("Конструктор по умолчанию");//установка тексту
                labelUp.setAlignment(Label.CENTER);//центрування тексту
                labelUp.setForeground(new Color(0, 0, 255));//колір тексту

                //Створення мітки конструктором з одним параметром
                Label labelCenter = new Label("Конструктор с 1-м параметром");
                labelCenter.setAlignment(Label.LEFT);//вирівнювання по лівому краю
                labelCenter.setBackground(new Color(0, 255, 0));//колір фону

                //Створення мітки конструктором з двома параметрами
                Label labelBottom = new Label("Конструктор с 2-мя параметрами", Label.RIGHT);

                //Розміщення міток в таблиці
                add(labelUp);
                add(labelCenter);
                add(labelBottom);

                //pack();//упаковка компонентів

                setVisible(true);//візуалізація форми

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
        new LabelDemo("LabelDemo");//відкрити форму
    }
}
