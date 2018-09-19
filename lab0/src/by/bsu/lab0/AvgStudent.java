package by.bsu.lab0;

import java.util.Scanner;

import static by.bsu.lab0.Group.*;

public class AvgStudent {
    static void avgSt() {
        for (Student i : studentsList) {
            System.out.println(i.getId() + ". " + i.getFirstName() + " " + i.getLastName());
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер студента:");
        int id = in.nextInt();
        double avg = 0;
        double sum = 0;
        int n = 0;
        for (Student i : studentsList) {
            if (i.getId().equals(id)) {
                for (int j = 0; j < i.getMarks().length; j++) {
                    sum += i.getMarks()[j];
                    n++;
                }
                avg = sum / n;
                System.out.println("Студент: " + i.getFirstName() + " " + i.getLastName()  + ". Средний балл: " + avg + ".");
            }
        }
    }
}
