/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author Lenovo
 */
public class Person {
     String personID;
    String name;
    String age;
    
    public Person() {
        
    }
    
    
    public Person(String personID, String name, String age) {
        this.personID = personID;
        this.name = name;
        this.age = age;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    @Override
    public String toString(){
        return personID;
    }
    
}
