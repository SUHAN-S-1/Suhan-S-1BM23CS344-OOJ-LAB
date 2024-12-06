import java.util.Scanner;

class Student {
    String usn;
    String name;
    int[] credits;
    int[] marks;

    Student(int numSubjects) {
        credits = new int[numSubjects];
        marks = new int[numSubjects];
    }

    void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter USN: ");
        usn = scanner.nextLine();

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        for (int i = 0; i < credits.length; i++) {
            System.out.print("Enter credit for subject " + (i + 1) + ": ");
            credits[i] = scanner.nextInt();

            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);

        for (int i = 0; i < credits.length; i++) {
            System.out.println("Subject " + (i + 1) + ": Marks = " + marks[i] + ", Credits = " + credits[i]);
        }
    }

    double calculateSGPA() {
        int totalCredits = 0;
        double weightedGradePointsSum = 0;

        for (int i = 0; i < credits.length; i++) {
            totalCredits += credits[i];
            weightedGradePointsSum += credits[i] * convertToGradePoint(marks[i]);
        }

        return weightedGradePointsSum / totalCredits;
    }

    double convertToGradePoint(int marks) {
        if (marks >= 90) return 10;
        else if (marks >= 80) return 9;
        else if (marks >= 70) return 8;
        else if (marks >= 60) return 7;
        else if (marks >= 50) return 6;
        else if (marks >= 40) return 5;
        else return 0;
    }
}

public class StudentSGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of subjects for each student: ");
        int numSubjects = scanner.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEntering details for student " + (i + 1));
            students[i] = new Student(numSubjects);
            students[i].acceptDetails();
        }

        for (int i = 0; i < n; i++) {
            students[i].displayDetails();
            double sgpa = students[i].calculateSGPA();
            System.out.println("SGPA: " + sgpa + "\n");
        }

        scanner.close();
    }
}
