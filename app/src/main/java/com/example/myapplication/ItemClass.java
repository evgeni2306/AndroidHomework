package com.example.myapplication;

public class ItemClass {

    private String name;
    private String surname;
    private String city;

    public ItemClass(String name, String surname, String city) {

        this.name = name;
        this.surname = surname;
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getcity(){return this.city;}
    public void setcity(String city){this.city=city;}
}
