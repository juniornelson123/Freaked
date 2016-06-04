package com.project.softkeys.freaked.model;

import com.orm.SugarRecord;

/**
 * Created by junio on 03/06/16.
 */
public class User extends SugarRecord {
    private String email;
    private String password;
    private TypeUser typeUser;
    private String phone;
    private String cep;
    private String address;
    private String number;
    private String complement;
    private String state;
    private String city;

    public User(){

    }

    public User(String email, String password, TypeUser type_User_id, String phone, String cep, String address, String number, String complement, String state, String city){
        this.setEmail(email);
        this.setPassword(password);
        this.setTypeUser(type_User_id);
        this.setPhone(phone);
        this.setCep(cep);
        this.setAddress(address);
        this.setNumber(number);
        this.setState(state);
        this.setCity(city);
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


    public TypeUser getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(TypeUser type_User_id) {
        this.typeUser = type_User_id;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
