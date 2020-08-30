/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private final int totalTypesOfNamesOfAPerson = 3;
    private String [] studentName = new String[totalTypesOfNamesOfAPerson];
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private String[] bookNames;

    public String[] getStudentName() {
        return studentName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public String[] getBookNames() {
        return bookNames;
    }

}

