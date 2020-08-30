/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final byte ISSUE_NEW_BOOK = 1;
    private static final byte RETURN_BOOK = 2;
    private static final byte SHOW_ALL_BOOKS = 3;
    private static final byte EXIT = 4;

    public static void main(String[] args) {
        long enterUniversityRollNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your University Roll number: ");
        enterUniversityRollNumber = scanner.nextLong();
        byte customerInput;
        Book book = new Book();
        Library library = new Library();
        Student student = new Student();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Please enter your choice from above Menu");
            customerInput = scanner.nextByte();
            switch (customerInput) {
                case ISSUE_NEW_BOOK:
                    book.showBookDetail();
                    break;
                case RETURN_BOOK:
                    student.showsStudentDetails();
                    break;
                case SHOW_ALL_BOOKS:
                    library.showListOfCurrentBooks();
                    break;
                default:
                    break;
            }

        } while (customerInput != EXIT);
        scanner.close();
    }

}
