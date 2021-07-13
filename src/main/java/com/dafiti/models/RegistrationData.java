package com.dafiti.models;

import com.dafiti.utils.ReturnRandom;

public class RegistrationData {

    private final String email;
    private final String password;
    private final String idType;
    private final String id;
    private final String name;
    private final String lastName;
    private final String bithDate;
    private final String gender;

    public RegistrationData(String password, String idType, String name, String lastName, String bithDate, String gender) {
        this.email ="esmicorreo"+ ReturnRandom.number() +"@gmail.com";
        this.password = password;
        this.idType = idType;
        this.id = ReturnRandom.number();
        this.name = name;
        this.lastName = lastName;
        this.bithDate = bithDate;
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getIdType() {
        return idType;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBithDate() {
        return bithDate;
    }

    public String getGender() {
        return gender;
    }
}
