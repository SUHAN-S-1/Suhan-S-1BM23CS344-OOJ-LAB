package SEE;

import CIE.Student;
import CIE.Internals;
import java.util.Scanner;

public class External extends Student {
    int[] externalMarks = new int[5];

    public External(String usn, String name, int sem) {
        super(usn, name, sem);
    }

    public void acceptExternalMarks() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter external marks for subject " + (i + 1) + ": ");
            externalMarks[i] = scanner.nextInt();
        }
    }

    public void displayExternalMarks() {
        System.out.println("External Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + externalMarks[i]);
        }
    }

    public void displayFinalMarks(Internals internals) {
        System.out.println(toString());
        internals.displayInternalMarks();
        displayExternalMarks();
        System.out.println("Final Marks:");
        int[] internalMarks = internals.getInternalMarks();
        for (int i = 0; i < 5; i++) {
            double scaledInternalMarks = (internalMarks[i] / 50.0) * 100;
            double finalMarks = (scaledInternalMarks + externalMarks[i]) / 2;
            System.out.println("Subject " + (i + 1) + ": " + finalMarks);
        }
    }
}
