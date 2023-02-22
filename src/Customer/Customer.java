/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer;

import Person.Person;
import Services.RentalRequest;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Customer extends Person {
    private int rentTotal;
    
     private ArrayList<RentalRequest> customerRentalList;
     
      public Customer() {
        super();
        this.customerRentalList = new ArrayList<RentalRequest>();
    }

    public int getRentTotal() {
        return rentTotal;
    }

    public void setRentTotal(int rentTotal) {
        this.rentTotal = rentTotal;
    }

    public ArrayList<RentalRequest> getCustomerRentalList() {
        return customerRentalList;
    }

    public void setCustomerRentalList(ArrayList<RentalRequest> customerRentalList) {
        this.customerRentalList = customerRentalList;
    }
      
      public void addOrder(RentalRequest request) {
        this.customerRentalList.add(request);
    }
    
    
}
