package com.project.softkeys.freaked.model;

import com.orm.SugarRecord;

/**
 * Created by junio on 03/06/16.
 */
public class PersonResponsable extends SugarRecord{
    private String name;
    private String office;

    public PersonResponsable(){

    }

    public PersonResponsable(String name,String office){
        this.setName(name);
        this.setOffice(office);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
}
