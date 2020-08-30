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
    public Library(){
        this.showCurrentBooksInLibrary=getShowCurrentBooksInLibrary();
    }

    @Override
    public String toString() {
        return "Library{" +
                "showCurrentBooksInLibrary=" + Arrays.toString(showCurrentBooksInLibrary) +
                '}';
    }
}
