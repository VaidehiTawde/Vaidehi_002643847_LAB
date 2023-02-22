/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Author.AuthorDirectory;
import Book.BookDirectory;
import Book.LibBooks;
import Customer.CustomerDirectory;
import Genre.GenreDirectory;
import Library.LibrarianDirectory;
import Services.RentalRequestDirectory;

/**
 *
 * @author Lenovo
 */
public class Business {
    private UserAccountDirectory userAccountDirectory;
    private CustomerDirectory customerDirectory;
    private LibrarianDirectory librarianDirectory;
    private BookDirectory bookDirectory;
    private AuthorDirectory authorDirectory;
    private GenreDirectory genreDirectory;
    private RentalRequestDirectory rentalRequestDirectory;
    
    public Business(){
        this.authorDirectory=new AuthorDirectory();
        this.bookDirectory=new BookDirectory();
        this.customerDirectory=new CustomerDirectory();
        this.genreDirectory=new GenreDirectory();
        this.librarianDirectory=new LibrarianDirectory();
        this.rentalRequestDirectory=new RentalRequestDirectory();
        this.userAccountDirectory=new UserAccountDirectory();
        
        UserAccount user = this.userAccountDirectory.createUserAccount("admin", "admin", "SysAdmin");
    }
    
    public static Business getBusinessInstance() {
        
        return new Business();
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public LibrarianDirectory getLibrarianDirectory() {
        return librarianDirectory;
    }

    public void setLibrarianDirectory(LibrarianDirectory librarianDirectory) {
        this.librarianDirectory = librarianDirectory;
    }

    public BookDirectory getBookDirectory() {
        return bookDirectory;
    }

    public void setBookDirectory(BookDirectory bookDirectory) {
        this.bookDirectory = bookDirectory;
    }

    public AuthorDirectory getAuthorDirectory() {
        return authorDirectory;
    }

    public void setAuthorDirectory(AuthorDirectory authorDirectory) {
        this.authorDirectory = authorDirectory;
    }

    public GenreDirectory getGenreDirectory() {
        return genreDirectory;
    }

    public void setGenreDirectory(GenreDirectory genreDirectory) {
        this.genreDirectory = genreDirectory;
    }

    public RentalRequestDirectory getRentalRequestDirectory() {
        return rentalRequestDirectory;
    }

    public void setRentalRequestDirectory(RentalRequestDirectory rentalRequestDirectory) {
        this.rentalRequestDirectory = rentalRequestDirectory;
    }
    
    
    
    
}
