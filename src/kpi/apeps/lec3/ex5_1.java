package kpi.apeps.lec3;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * Введення даних в файл з використанням PrintStream
 * Виведення даних з файлу з використанням Scanner
 */
public class ex5_1 {
    public static void main(String[] args) {
        //Введення даних
        try(PrintStream printStream = new PrintStream("C:\\Users\\Admin\\IdeaProjects\\tkpz\\src\\kpi\\apeps\\lec3\\demoPrintStream.txt"))
        {
            printStream.print("Hello World!");
            printStream.println("Welcome to Java!");
            printStream.printf("Name: %s Age: %d \n", "Tom", 34);

            System.out.println("The file has been written");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        //Виведення даних
        System.out.println("\nFile contents:");
        try {
            Scanner scanner = new Scanner(Path.of("C:\\Users\\Admin\\IdeaProjects\\tkpz\\src\\kpi\\apeps\\lec3\\demoPrintStream.txt"));
            do {
                System.out.println(scanner.nextLine());
            }while (scanner.hasNextLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
