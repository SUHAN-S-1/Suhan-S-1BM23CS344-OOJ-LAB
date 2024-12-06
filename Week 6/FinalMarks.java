import CIE.Student;
import CIE.Internals;
import SEE.External;
import java.util.Scanner;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));

            System.out.print("Enter USN: ");
            String usn = scanner.nextLine();

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Semester: ");
            int sem = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            External student = new External(usn, name, sem);

            Internals internals = new Internals();
            internals.acceptInternalMarks();

            System.out.println("\nEnter external marks for student " + (i + 1));
            student.acceptExternalMarks();

            student.displayFinalMarks(internals);
        }

        scanner.close();
    }
}
