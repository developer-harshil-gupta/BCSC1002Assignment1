/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private String [] showCurrentBooksInLibrary;

    public String[] getShowCurrentBooksInLibrary() {
        return showCurrentBooksInLibrary;
    }

    public void setShowCurrentBooksInLibrary(String[] showCurrentBooksInLibrary) {
        this.showCurrentBooksInLibrary = showCurrentBooksInLibrary;
    }

    public Library() {
        this.showCurrentBooksInLibrary = getShowCurrentBooksInLibrary();
    }

    @Override
    public String toString() {
        return "Library{" +
                "showCurrentBooksInLibrary=" + Arrays.toString(showCurrentBooksInLibrary) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getShowCurrentBooksInLibrary(), library.getShowCurrentBooksInLibrary());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getShowCurrentBooksInLibrary());
    }
}