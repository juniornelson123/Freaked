package com.project.softkeys.freaked.model;

import com.orm.SugarRecord;

/**
 * Created by junio on 03/06/16.
 */
public class TypeUser extends SugarRecord {
    private String name;

    public TypeUser(){

    }

    public TypeUser(String name){
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
