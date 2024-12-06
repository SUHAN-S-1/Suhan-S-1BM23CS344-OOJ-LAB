package CIE;

import java.util.Scanner;

public class Internals {
    private int[] internalMarks = new int[5];

    public void acceptInternalMarks() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter internal marks for subject " + (i + 1) + ": ");
            internalMarks[i] = scanner.nextInt();
        }
    }

    public void displayInternalMarks() {
        System.out.println("Internal Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + internalMarks[i]);
        }
    }

    public int[] getInternalMarks() {
        return internalMarks;
    }

    public void setInternalMarks(int[] marks) {
        this.internalMarks = marks;
    }
}
