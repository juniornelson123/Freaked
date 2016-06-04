package com.project.softkeys.freaked.model;

import com.orm.SugarRecord;

/**
 * Created by junio on 03/06/16.
 */
public class Client extends SugarRecord {
    private String name;
    private String apelido;
    private String cpf;
    private boolean gender;
    private User user;

    public Client(){

    }

    public Client(String name,String apelido,String cpf,boolean gender,User user){
        this.setName(name);
        this.setApelido(apelido);
        this.setCpf(cpf);
        this.setGender(gender);
        this.setUser(user);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
