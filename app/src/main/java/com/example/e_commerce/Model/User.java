package com.example.e_commerce.Model;

public class User {
    private String name, password, phone,image,address;

    public User() {

    }

    public User(String name, String password, String phone, String image, String address) {
        this.name = name;
        this.password = password;
        this.phone = phone;
        this.image = image;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getImage() {
        return image;
    }

    public String getAddress() {
        return address;
    }
}
