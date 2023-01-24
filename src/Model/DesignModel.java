/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class DesignModel {
    
    long nuID;
    String firstName;
    String lastName;
    String collegeName;
    Address addr;
    ContactInfo cont;
    
    public DesignModel(){
    
        this.nuID=0;
        this.firstName="";
        this.lastName="";
        this.collegeName="";
        this.addr=new Address();
        this.cont=new ContactInfo();
       
    }

    public long getNuID() {
        return nuID;
    }

    public void setNuID(long nuID) {
        this.nuID = nuID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Address getAddr() {
        return addr;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    public ContactInfo getCont() {
        return cont;
    }

    public void setCont(ContactInfo cont) {
        this.cont = cont;
    }
    
    public static void main(String args[]){
    
    }

    public Object getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
