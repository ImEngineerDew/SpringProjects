package com.toadsdewin.Hospital;

public class Person
{
    private String name;
    private String surname;
    private String country;
    private Integer numberIdent;
    private Integer phoneNumber;

    public Person()
    {
        name = "John";
        surname = "Doe";
        country = "United States";
        numberIdent = 1111222;
        phoneNumber = 5551234;
    }

    public Person(String name, String surname, String country, Integer numberIdent, Integer phoneNumber)
    {
        this.name = name;
    }

}
