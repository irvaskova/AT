package by.bsu.lab0;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private int[] marks;

    Student(int id, String firstName, String lastName, int[] marks) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int[] getMarks() {
        return marks;
    }

    public String toString() {
        return String.format("ID: %d\t name: %s\t surname: %s\t marks: %d",
                id, firstName, lastName, marks);
    }
}
