package by.bsu.lab0;

import java.util.*;

public class Group {
    private Integer groupNum;
    public static ArrayList<Student> studentsList = new ArrayList<>();

    Group(Integer groupNum) {
        this.groupNum = groupNum;
    }

    void addStudentToStudentsList(Student student) {
        studentsList.add(student);
    }
}
