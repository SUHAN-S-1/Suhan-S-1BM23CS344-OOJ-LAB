package CIE;

public class Student {
    String usn;
    String name;
    int sem;

    public Student(String usn, String name, int sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }

    public String toString() {
        return "USN: " + usn + ", Name: " + name + ", Semester: " + sem;
    }
}
