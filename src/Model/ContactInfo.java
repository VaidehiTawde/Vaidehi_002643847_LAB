/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lenovo
 */
public class ContactInfo {
    
    long personalPhone;
    String personalEmailid;
    long officePhone;
    String officeEmailid;
    
    public ContactInfo(){
    
        this.personalPhone=0;
        this.personalEmailid="";
        this.officePhone=0;
        this.officeEmailid="";
        
    }

    public long getPersonalPhone() {
        return personalPhone;
    }

    public void setPersonalPhone(long personalPhone) {
        this.personalPhone = personalPhone;
    }

    public String getPersonalEmailid() {
        return personalEmailid;
    }

    public void setPersonalEmailid(String personalEmailid) {
        this.personalEmailid = personalEmailid;
    }

    public long getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(long officePhone) {
        this.officePhone = officePhone;
    }

    public String getOfficeEmailid() {
        return officeEmailid;
    }

    public void setOfficeEmailid(String officeEmailid) {
        this.officeEmailid = officeEmailid;
    }
    
}
