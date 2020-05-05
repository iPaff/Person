package com.company;

public class Person {

    String firstName;
    String lastName;
    int age;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        if (age < 0 || age > 100){
            this.age = 0;
    }else{
            this.age = age;
        }
    }
    public boolean isTeen(){
         return this.age > 12 && this.age < 20 ? true : false;
    }
    public String getFullName(){
        if (firstName.isEmpty() && lastName.isEmpty()){
            return ""; // is it possible to use null ?
        }if (lastName.isEmpty()){
            return firstName;
        }else{ firstName.isEmpty(); // why couldn't we use only return lastName?
            return lastName;
        }
    }

}
