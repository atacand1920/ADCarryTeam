package com.androidbelieve.drawerwithswipetabs.Entity;

import java.util.Date;

/**
 * Created by atacand19200 on 20/11/2016.
 */

public class Product {
    private int id ;
    private String Title;
    private Double Price;
    private String images;
    private int Quantity;
    private String Categorie;
    private boolean etat;
    private Date date_create;
    private String location;
    private String Description;
    private Users id_user;

    public Product() {
    }

    public Product(int id, String title, Double price, String images, int quantity, String categorie, boolean etat, Date date_create, String location, String description, Users id_user) {
        this.id = id;
        Title = title;
        Price = price;
        this.images = images;
        Quantity = quantity;
        Categorie = categorie;
        this.etat = etat;
        this.date_create = date_create;
        this.location = location;
        Description = description;
        this.id_user = id_user;
    }

    public Product(String title, Double price, String images, int quantity, String categorie, boolean etat, Date date_create, String location, String description, Users id_user) {
        Title = title;
        Price = price;
        this.images = images;
        Quantity = quantity;
        Categorie = categorie;
        this.etat = etat;
        this.date_create = date_create;
        this.location = location;
        Description = description;
        this.id_user = id_user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getCategorie() {
        return Categorie;
    }

    public void setCategorie(String categorie) {
        Categorie = categorie;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    public Date getDate_create() {
        return date_create;
    }

    public void setDate_create(Date date_create) {
        this.date_create = date_create;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Users getId_user() {
        return id_user;
    }

    public void setId_user(Users id_user) {
        this.id_user = id_user;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", Title='" + Title + '\'' +
                ", Price=" + Price +
                ", images='" + images + '\'' +
                ", Quantity=" + Quantity +
                ", Categorie='" + Categorie + '\'' +
                ", etat=" + etat +
                ", date_create=" + date_create +
                ", location='" + location + '\'' +
                ", Description='" + Description + '\'' +
                ", id_user=" + id_user +
                '}';
    }
}
