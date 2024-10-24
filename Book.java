import java.util.Scanner;

class Bo {
    private String name;
    private String author;
    private double price;
    private int numPages;

    public Bo(String name, String author, double price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getNumPages() {
        return numPages;
    }

    public String toString() {
        return "Book{" +
                "Name='" + name + '\'' +
                ", Author='" + author + '\'' +
                ", Price=" + price +
                ", Number of Pages=" + numPages +
                '}';
    }
}

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();
	scanner.nextLine();

        Bo[] books = new Bo[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Number of Pages: ");
            int numPages = scanner.nextInt();
	    scanner.nextLine();

            books[i] = new Bo(name, author, price, numPages);
        }

        System.out.println("\nBook Details:");
        for (Bo book : books) {
            System.out.println(book);
        }
    }
}
