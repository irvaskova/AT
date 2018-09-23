package by.bsu.lab0;

import java.util.ArrayList;

public class Group {
    private int groupNum;
    public static ArrayList<Student> studentsList = new ArrayList<>();

    Group(int groupNum) {
        this.groupNum = groupNum;
    }

    void addStudentToStudentsList(Student student) {
        studentsList.add(student);
    }
}
