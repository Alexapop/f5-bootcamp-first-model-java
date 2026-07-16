package com.ioana;

import java.time.Year;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String idCardNumber;
    private Integer yearOfBirth;
    private Integer age;

    public Person(
        String firstName,
        String lastName,
        String idCardNumber,
        Integer yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idCardNumber = idCardNumber;
        this.yearOfBirth = yearOfBirth;
        this.age = calculateAge();
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getIdCardNumber(){
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber){
        this.idCardNumber = idCardNumber;
    }

    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public Integer getAge() {
        return age;
    }
    
    public Integer calculateAge() {
        return Year.now().getValue() - yearOfBirth;

    }

    @Override
    public int hashCode() {
        return Objects.hash(idCardNumber);
    }
    @Override
      public boolean equals(Object object) {
        if (this == object) 
            return true; 
        if (object == null || getClass() != object.getClass())
             return false; 
     Person otherPerson = (Person) object;
                return Objects.equals(idCardNumber, otherPerson.idCardNumber);
    }
}


  
