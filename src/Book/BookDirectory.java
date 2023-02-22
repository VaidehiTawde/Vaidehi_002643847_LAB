/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class BookDirectory {
    ArrayList<LibBooks> booksList;
    
    public BookDirectory(){
        this.booksList=new ArrayList<LibBooks>();
        
    }

    public ArrayList<LibBooks> getBooksList() {
        return booksList;
    }

    public void setBooksList(ArrayList<LibBooks> booksList) {
        this.booksList = booksList;
    }
    
    public LibBooks AddBooks(String id, String name, String author, String genre){
        LibBooks b=new LibBooks();
        b.setBookId(id);
        b.setBookAuthor(author);
        b.setBookGenre(genre);
        b.setBookName(name);
        this.booksList.add(b);
        return b;
     
    }
    
         public LibBooks findById(String id) {
        for(LibBooks b: this.booksList) {
            if(b.getBookId().equals(id)) {
                return b;
            }
        }
        
        return null;
    }
    
    
}
