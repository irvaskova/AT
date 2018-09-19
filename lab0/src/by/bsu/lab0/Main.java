package by.bsu.lab0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group gr = new Group(12);
        gr.addStudentToStudentsList(new Student(1, "Иван", "Дроздов", new int[]{4, 4, 9, 6, 7}));
        gr.addStudentToStudentsList(new Student(2, "Анастасия", "Иванова", new int[]{5, 6, 7}));
        gr.addStudentToStudentsList(new Student(3, "Александр", "Фролов", new int[]{9, 8, 9, 9, 7}));
        gr.addStudentToStudentsList(new Student(4, "Алла", "Ларченко", new int[]{8, 6}));
        gr.addStudentToStudentsList(new Student(5, "Валерия", "Петрова", new int[]{6, 6, 7, 8}));


        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("-------------------------------------");
            System.out.println("Выберете действие: ");
            System.out.println("1. Посчитать средний балл студента;");
            System.out.println("2. Посчитать средний балл группы;");
            System.out.println("3. Выход.");
            System.out.println("Ваш выбор: ");
            int choice = in.nextInt();
            Choice(choice);
        }
    }

    private static void Choice(int choice) {
        switch (choice) {
            case 1:
                AvgStudent.avgSt();
                break;
            case 2:
                AvgGroup.avgGr();
                break;
            case 3:
                System.exit(0);
        }
    }
}

