package com.kaishengit.entity;

/**
 * Created by zhangyu on 2017/10/23.
 */
public class User {
    private int id;
    private String userName;
    private String address;
    private String passWord;
    private int countryId;
    private Country country;

    public User(){}
    public User(String userName,String address,String passWord){
        this.userName = userName;
        this.address = address;
        this.passWord = passWord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", passWord='" + passWord + '\'' +
                ", countryId=" + countryId +
                ", country=" + country +
                '}';
    }
}