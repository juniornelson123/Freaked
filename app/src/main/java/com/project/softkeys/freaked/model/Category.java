package com.project.softkeys.freaked.model;

import com.orm.SugarRecord;

/**
 * Created by junio on 04/06/16.
 */
public class Category extends SugarRecord{
    private String name;

    public Category(){

    }
    public Category(String name){
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
