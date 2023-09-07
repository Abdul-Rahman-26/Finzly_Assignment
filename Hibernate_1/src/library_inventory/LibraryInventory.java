package library_inventory;

import java.util.List;
import java.util.Scanner;

public class LibraryInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operations operations = new Operations();

        while (true) {
            System.out.println("Library Inventory Management System");
            System.out.println("1. Add a new book");
            System.out.println("2. Search for books");
            System.out.println("3. Update book details");
            System.out.println("4. Delete a book");
            System.out.println("5. Display all books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Add a new book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int publicationYear = scanner.nextInt();
                    System.out.print("Enter ISBN: ");
                    int isbn = scanner.nextInt();

                    Book newBook = new Book(title, author, publicationYear, isbn);
                    operations.addBook(newBook);
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    // Search for books
                    System.out.println("Search options:");
                    System.out.println("1. By Title/Keywords");
                    System.out.println("2. By Author");
                    System.out.println("3. By Publication Year Range");
                    System.out.println("4. By ISBN");
                    System.out.print("Enter your search option: ");
                    int searchOption = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    switch (searchOption) {
                        case 1:
                            System.out.print("Enter title or keywords: ");
                            String searchString = scanner.nextLine();
                            List<Book> searchResult = operations.searchBooksByTitleOrKeywords(searchString);
                            // Display search results
                            for (Book book : searchResult) {
                                System.out.println(book);
                            }
                            break;
                        case 2:
                            System.out.print("Enter author name: ");
                            String authorName = scanner.nextLine();
                            List<Book> booksByAuthor = operations.searchBooksByAuthor(authorName);
                            // Display books by the author
                            for (Book book : booksByAuthor) {
                                System.out.println(book);
                            }
                            break;
                        case 3:
                            System.out.print("Enter start year: ");
                            int startYear = scanner.nextInt();
                            System.out.print("Enter end year: ");
                            int endYear = scanner.nextInt();
                            List<Book> booksByYearRange = operations.searchBooksByYearRange(startYear, endYear);
                            // Display books in the year range
                            for (Book book : booksByYearRange) {
                                System.out.println(book);
                            }
                            break;
                        case 4:
                            System.out.print("Enter ISBN: ");
                            int searchISBN = scanner.nextInt();
                            Book bookByISBN = operations.searchBookByISBN(searchISBN);
                            if (bookByISBN != null) {
                                System.out.println(bookByISBN);
                            } else {
                                System.out.println("Book not found.");
                            }
                            break;
                        default:
                            System.out.println("Invalid search option.");
                    }
                    break;
                case 3:
                    System.out.print("Enter ISBN of the book to update: ");
                    int updateISBN = scanner.nextInt();
                    scanner.nextLine();

                    Book existingBook = operations.searchBookByISBN(updateISBN);

                    if (existingBook != null) {
                        System.out.println("Current book details:");
                        System.out.println(existingBook);

                        System.out.print("Enter new book title (or press Enter to keep it unchanged): ");
                        String newTitle = scanner.nextLine();
                        if (!newTitle.isEmpty()) {
                            existingBook.setTitle(newTitle);
                        }

                        System.out.print("Enter new author (or press Enter to keep it unchanged): ");
                        String newAuthor = scanner.nextLine();
                        if (!newAuthor.isEmpty()) {
                            existingBook.setAuthor(newAuthor);
                        }

                        System.out.print("Enter new publication year (or enter 0 to keep it unchanged): ");
                        int newPublicationYear = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        if (newPublicationYear != 0) {
                            existingBook.setPublicationYear(newPublicationYear);
                        }

                        // Update the book with the new details
                        operations.updateBook(existingBook);
                        System.out.println("Book details updated successfully!");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;


                case 4:
                    System.out.print("Enter ISBN of the book to delete: ");
                    int deleteISBN = scanner.nextInt();
                    operations.deleteBook(deleteISBN);
                    System.out.println("Book deleted successfully!");
                    break;

                case 5:
                    List<Book> allBooks = operations.getAllBooks();
                    for (Book book : allBooks) {
                        System.out.println(book);
                    }
                    break;

                case 6:
                    System.out.println("Exiting Library Inventory Management System.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
