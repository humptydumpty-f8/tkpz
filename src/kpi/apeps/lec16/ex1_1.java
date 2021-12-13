package kpi.apeps.lec16;

/**
 * Формування основного вікна програми
 */

import javax.swing.*;//імпорт класів бібліотеки swing

//Наслідування класу JFrame
public class ex1_1 extends JFrame {

    public static void main(String[] args) {

        JFrame jFrame = new ex1_1();//створення вікна
        jFrame.setSize(300,300);//визначення ненульових розмірів вікна
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//завершити додаток при натисненні кнопки закривання
        jFrame.setVisible(true);//візуалізація вікна
    }
}
