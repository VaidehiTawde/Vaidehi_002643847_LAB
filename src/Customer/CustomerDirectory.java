/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class CustomerDirectory {
    
     ArrayList<Customer> customerlist;
    
    public CustomerDirectory() {
        this.customerlist = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerlist() {
        return customerlist;
    }

    public void setCustomerlist(ArrayList<Customer> customerlist) {
        this.customerlist = customerlist;
    }
    
     public Customer findById(String id) {
        for(Customer c: this.customerlist) {
            if(c.getPersonID().equals(id)) {
                return c;
            }
        }
        
        return null;
    }
    
    public Customer createCustomer(String id, String name, String age) {
        Customer c = new Customer();
        c.setPersonID(id);
        c.setName(name);
        c.setAge(age);
        
        this.customerlist.add(c);
        return c;
    }
}
    
    

