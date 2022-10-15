package com.toadsdewin.Hospital.Person;

public class PersonModel
{
    private String name;
    private String surname;
    private Integer age;
    private Integer phoneNumber;
    private String countryOfOrigin;

    public PersonModel()
    {
        name    = "John";
        surname = "Doe";
        age     =  30;
        phoneNumber = 5551234;
        countryOfOrigin = "United States";
    }
    public PersonModel(String name, String surname, String countryOfOrigin, Integer age, Integer phoneNumber)
    {
        this.name = name;
        this.surname = surname;
        this.countryOfOrigin = countryOfOrigin;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    /**Getters and Setters**/
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public Integer getAge() {
        return age;
    }
    public Integer getPhoneNumber() {
        return phoneNumber;
    }
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}
