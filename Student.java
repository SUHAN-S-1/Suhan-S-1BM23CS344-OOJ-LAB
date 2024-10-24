import java.util.Scanner;

class Stu {
    private String usn;            
    private String name;           
    private int[] credits;         
    private int[] marks;           

    public Stu(int numberOfSubjects) {
        credits = new int[numberOfSubjects];
        marks = new int[numberOfSubjects];
    }

    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter USN: ");
        usn = scanner.nextLine();

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        for (int i = 0; i < credits.length; i++) {
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            credits[i] = scanner.nextInt();
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    public void displayDetails() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
        for (int i = 0; i < credits.length; i++) {
            System.out.println("Subject " + (i + 1) + ": Credits = " + credits[i] + ", Marks = " + marks[i]);
        }
        System.out.print("SGPA: "+calculateSGPA());
    }

    public double calculateSGPA() {
        int totalCredits = 0;
        double totalPoints = 0.0;

        for (int i = 0; i < credits.length; i++) {
            totalCredits += credits[i];
            totalPoints += (marks[i]/10.0) * credits[i];
        }

        return totalPoints/totalCredits;
    }
}

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

        Stu student = new Stu(numberOfSubjects);

        student.acceptDetails();

        student.displayDetails();

    }
}
