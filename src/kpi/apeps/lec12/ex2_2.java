package kpi.apeps.lec12;

import java.awt.*;

/**
 * Екранна заставка
 */
public class ex2_2 extends Frame {

    // Клас заставки успадковується від Window
    static class SplashScreenDemo extends Window {

        // Конструктор заставки
        public SplashScreenDemo() {
            super(new Frame());//виклик батьківського конструктора
            setBackground(new Color(0, 255, 150));//колір фону
            setSize(300, 200);//розміри
            setLocation(200, 300);//розташування

            //Створення компонентів заставки
            Label lbl1 = new Label("____________", Label.CENTER);
            Label lbl2 = new Label("Splash Demo", Label.CENTER);
            Label lbl3 = new Label("____________", Label.CENTER);

            //Додавання компонентів заставки в контейнер
            add(lbl1, BorderLayout.NORTH);
            add(lbl2, BorderLayout.CENTER);
            add(lbl3, BorderLayout.SOUTH);

            setVisible(true);//зробити видимою
        }
    }

    public static void main(String[] args) {

        // Відображаємо заставку
        SplashScreenDemo splash = new SplashScreenDemo();

        try {
            Thread.sleep(5 * 1000);//демонстркємо 5 сек
        } catch (InterruptedException e) {
        }

        // Вимикаємо заставку
        splash.setVisible(false);
        splash.dispose();

        //Завершуємо роботу додатку
        System.exit(0);
    }
}
