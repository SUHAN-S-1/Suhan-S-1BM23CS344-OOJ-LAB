import java.util.Scanner;

class Books {
    private String name;
    private String author;
    private double price;
    private int num_pages;

    public Books(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setNumPages(int num_pages) {
        this.num_pages = num_pages;
    }

    public int getNumPages() {
        return num_pages;
    }

    public String toString() {
        return "Book Name: " + name + "\n" +
               "Author: " + author + "\n" +
               "Price: " + price + "\n" +
               "Number of Pages: " + num_pages;
    }
}

public class Book {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of books: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Books[] books = new Books[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for book " + (i + 1) + ":");

            System.out.print("Enter book name: ");
            String name = scanner.nextLine();

            System.out.print("Enter author name: ");
            String author = scanner.nextLine();

            System.out.print("Enter price: ");
            double price = scanner.nextDouble();

            System.out.print("Enter number of pages: ");
            int num_pages = scanner.nextInt();
            scanner.nextLine();

            books[i] = new Books(name, author, price, num_pages);
        }

        System.out.println("\nBook Details:");

        for (int i = 0; i < n; i++) {
            System.out.println("\nDetails of Book " + (i + 1) + ":");
            System.out.println(books[i].toString());
        }

        scanner.close();
    }
}
