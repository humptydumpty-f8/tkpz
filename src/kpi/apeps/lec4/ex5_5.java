package kpi.apeps.lec4;

import java.util.Locale;

/**
 * Переформатування тексту методами String
 */
public class ex5_5 {
    public static void main(String[] args) {

        String data = "name: Igor\nsurname: Kolashnikov\nage: 14\ntime: 14: 55";
        System.out.println("\tOriginal data: \n" +
                data);
// розбиваємо рядок на кілька подрядків
        String[] lines = data.split("\n");
        System.out.println("\n\tFinal data:");
// проходимо кожну підрядку
        for (String line : lines) {
            // знаходимо індекс першого входження символу ":" в підрядку
            int pos = line.indexOf(":");
            // виокремлює ім'я атрибута з підрядка
            String attributeName = line.substring(0, pos);
            // виокремлює значення атрибута
            String value = line.substring(pos + 1, line.length());
            // вивід на екран вичленованих значень в потрібному нам форматі.
            System.out.println(attributeName.toUpperCase(Locale.ROOT) + "\t" + value);

        }
    }
}

