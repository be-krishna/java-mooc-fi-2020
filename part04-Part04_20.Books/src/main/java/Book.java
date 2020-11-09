/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author be-krishna
 */
public class Book {

    private String title;
    private String numberOfPages;
    private String publicationYear;

    public Book(String bookTitle, String bookPages, String bookYear) {
        this.title = bookTitle;
        this.numberOfPages = bookPages;
        this.publicationYear = bookYear;
    }
    
    public String getName(){
        return this.title;
    }

    public String toString() {
        return title + ", " + numberOfPages + " pages, " + publicationYear;
    }
}
