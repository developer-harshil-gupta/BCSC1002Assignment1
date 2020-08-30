/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;

public class Student {
    private final int TOTAL_TYPES_OF_NAMES_OF_PERSON = 3;
    private String [] studentNames = new String[TOTAL_TYPES_OF_NAMES_OF_PERSON];
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private String[] bookNames;

    public String[] getStudentNames() {
        return studentNames;
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

    public void setBookNames(String[] bookNames) {
        this.bookNames = bookNames;
    }

    public void setStudentNames(String[] studentNames) {
        this.studentNames = studentNames;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }
    public Student(){
        this.bookNames=getBookNames();
        this.numberOfBooksIssued=getNumberOfBooksIssued();
        this.studentNames=getStudentNames();
        this.universityRollNumber=getUniversityRollNumber();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNames=" + Arrays.toString(studentNames) +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", bookNames=" + Arrays.toString(bookNames) +
                '}';
    }
}

