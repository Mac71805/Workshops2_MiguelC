package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] books = new Book[20];

        books[0] = new Book(1, "978-0001", "Harry Potter");
        books[1] = new Book(2, "978-0002", "The Hobbit");
        books[2] = new Book(3, "978-0003", "Percy Jackson");
        books[3] = new Book(4, "978-0004", "Dune");
        books[4] = new Book(5, "978-0005", "1984");
        books[5] = new Book(6, "978-0006", "To Kill a Mockingbird");
        books[6] = new Book(7, "978-0007", "The Giver");
        books[7] = new Book(8, "978-0008", "Maze Runner");
        books[8] = new Book(9, "978-0009", "Twilight");
        books[9] = new Book(10, "978-0010", "Eragon");
        books[10] = new Book(11, "978-0011", "Fahrenheit 451");
        books[11] = new Book(12, "978-0012", "The Catcher in the Rye");
        books[12] = new Book(13, "978-0013", "Lord of the Flies");
        books[13] = new Book(14, "978-0014", "Animal Farm");
        books[14] = new Book(15, "978-0015", "The Alchemist");
        books[15] = new Book(16, "978-0016", "Dracula");
        books[16] = new Book(17, "978-0017", "Frankenstein");
        books[17] = new Book(18, "978-0018", "The Shining");
        books[18] = new Book(19, "978-0019", "It");
        books[19] = new Book(20, "978-0020", "The Great Gatsby");

        while(true) {
            System.out.println("\n=== BOOK STORE HOME SCREEN ===");
            System.out.println();
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int userInput = scanner.nextInt();

            if(userInput == 1){
                for(int i = 0; i < books.length; i++){

                    if (books[i].isCheckedOut() == false) {
                        System.out.println(
                                books[i].getId() + " | " +
                                        books[i].getIsbn() + " | " +
                                        books[i].getTitle()
                        );
                    }
                }
                System.out.print("\nEnter book ID to check out (or 0 to go back): ");
                int id = scanner.nextInt();
                if(id != 0){
                    System.out.println("Enter your name: ");
                    scanner.nextLine(); //dang you Java I forgot about this
                    String name = scanner.nextLine();

                    for(int i = 0; i < books.length; i++){
                        if(books[i].getId() == id){
                            books[i].checkOut(name);
                            System.out.println("You checked out your book");
                        }
                    }
                }



            }

        }
}   }