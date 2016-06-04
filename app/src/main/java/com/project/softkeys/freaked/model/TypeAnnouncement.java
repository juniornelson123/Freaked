package com.project.softkeys.freaked.model;

import com.orm.SugarRecord;

/**
 * Created by junio on 04/06/16.
 */
public class TypeAnnouncement extends SugarRecord{
    private String name;

    private TypeAnnouncement(){

    }
    private TypeAnnouncement(String name){
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
