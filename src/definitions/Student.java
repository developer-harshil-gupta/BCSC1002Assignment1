/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private final int NUMBER_OF_SECTIONS_IN_NAME = 3;
    private String [] studentNames = new String[NUMBER_OF_SECTIONS_IN_NAME];
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getNumberOfBooksIssued() == student.getNumberOfBooksIssued() &&
                Arrays.equals(getStudentNames(), student.getStudentNames()) &&
                Arrays.equals(getBookNames(), student.getBookNames());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getUniversityRollNumber(), getNumberOfBooksIssued());
        result = 31 * result + Arrays.hashCode(getStudentNames());
        result = 31 * result + Arrays.hashCode(getBookNames());
        return result;
    }
}

