/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

/**
 *
 * @author Lenovo
 */
public class LibBooks {
    private String bookId;
    private String bookName;
    private String bookAuthor;
    private String bookGenre;
    
    public LibBooks(){
        this.bookId=bookId;
        this.bookAuthor=bookAuthor;
        this.bookGenre=bookGenre;
        this.bookName=bookName;
    }

    public LibBooks(String bookId, String bookName, String bookAuthor, String bookGenre) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookGenre = bookGenre;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }


    

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }
    
    @Override
    public String toString(){
        return bookId;
    }
    
}
