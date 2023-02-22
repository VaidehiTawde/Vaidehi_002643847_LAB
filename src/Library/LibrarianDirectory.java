/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class LibrarianDirectory {
    ArrayList<Librarian> librarianList;
    
    public LibrarianDirectory(){
        this.librarianList=new ArrayList<Librarian>();
        
    }

    public ArrayList<Librarian> getLibrarianList() {
        return librarianList;
    }

    public void setLibrarianList(ArrayList<Librarian> librarianList) {
        this.librarianList = librarianList;
    }
    
    
    
}
