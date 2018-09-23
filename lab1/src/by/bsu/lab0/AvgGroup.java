package by.bsu.lab0;

import static by.bsu.lab0.Group.studentsList;

public class AvgGroup {
    static void avgGr() {
        double avg = 0;
        double sum = 0;
        int n = 0;
        for (Student i : studentsList) {
            for (int j = 0; j < i.getMarks().length; j++) {
                sum += i.getMarks()[j];
                n++;
            }
        }
        avg = sum / n;
        System.out.println("Средний балл по группе: " + avg + ".");

    }
}