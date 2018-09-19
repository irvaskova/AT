package by.bsu.lab0;

public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private int[] marks;

    Student (Integer id, String firstName, String lastName, int[] marks) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = marks;
    }

    public Integer getId() {
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
        return String.format("id: %\t firstName: %s\t lastName: %s\t marks: %d",
                id, firstName, lastName, marks);
    }
}
