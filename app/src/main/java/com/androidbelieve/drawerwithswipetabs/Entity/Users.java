package com.androidbelieve.drawerwithswipetabs.Entity;

/**
 * Created by atacand19200 on 20/11/2016.
 */

public class Users {
    private int id;
    private String FirstName;
    private String LastName;
    private int Age;
    private String Sexe;
    private String email;
    private String password;
    private int Phone;
    private String Pseudo;

    public Users() {
    }

    public Users(int id, String firstName, String lastName, int age, String sexe, String email, String password, int phone, String pseudo) {
        this.id = id;
        FirstName = firstName;
        LastName = lastName;
        Age = age;
        Sexe = sexe;
        this.email = email;
        this.password = password;
        Phone = phone;
        Pseudo = pseudo;
    }

    public Users(String firstName, String lastName, int age, String sexe, String email, String password, int phone, String pseudo) {
        FirstName = firstName;
        LastName = lastName;
        Age = age;
        Sexe = sexe;
        this.email = email;
        this.password = password;
        Phone = phone;
        Pseudo = pseudo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getSexe() {
        return Sexe;
    }

    public void setSexe(String sexe) {
        Sexe = sexe;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public String getPseudo() {
        return Pseudo;
    }

    public void setPseudo(String pseudo) {
        Pseudo = pseudo;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Age=" + Age +
                ", Sexe='" + Sexe + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", Phone=" + Phone +
                ", Pseudo='" + Pseudo + '\'' +
                '}';
    }
}
