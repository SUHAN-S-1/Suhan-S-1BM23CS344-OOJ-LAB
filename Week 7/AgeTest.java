import java.util.Scanner;

class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

class Father {
    int fatherAge;

    public Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative.");
        }
        fatherAge = age;
    }

    public String toString() {
        return "Father's age: " + fatherAge;
    }
}

class Son extends Father {
    int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);
        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to Father's age.");
        }
        this.sonAge = sonAge;
    }

    public String toString() {
        return super.toString() + ", Son's age: " + sonAge;
    }
}

public class AgeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter Father's age: ");
            int fatherAge = scanner.nextInt();
            Father father = new Father(fatherAge);
            System.out.println(father);

            System.out.print("Enter Son's age: ");
            int sonAge = scanner.nextInt();
            Son son = new Son(fatherAge, sonAge);
            System.out.println(son);

        } catch (WrongAge e) {
            System.out.println("Exception: " + e.getMessage());
        }
        
        scanner.close();
    }
}
