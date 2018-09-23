package by.bsu.lab0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group gr = new Group(12);
        gr.addStudentToStudentsList(new Student(1, "Иван", "Дроздов", new int[]{4, 9, 7}));
        gr.addStudentToStudentsList(new Student(2, "Анастасия", "Иванова", new int[]{7, 9, 8, 5, 7}));
        gr.addStudentToStudentsList(new Student(3, "Александр", "Богомолов", new int[]{5, 9, 8, 8}));
        gr.addStudentToStudentsList(new Student(4, "Иван", "Фролов", new int[]{8, 9, 7, 8}));
        gr.addStudentToStudentsList(new Student(5, "Алла", "Петрова", new int[]{4, 4, 6, 5, 6}));

    while(true) {
        Scanner in = new Scanner(System.in);
        System.out.println("-----------------------------------");
        System.out.println("Выберите действие:");
        System.out.println("1. Вывод среднего балла студента;");
        System.out.println("2. Вывод среднего балла группы;");
        System.out.println("3. Выход.");
        System.out.println("Ваш выбор: ");
        int ch = in.nextInt();
        choice(ch);
    }
    }

    private static void choice(int ch) {
        switch (ch) {
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
