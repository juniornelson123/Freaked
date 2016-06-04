package com.project.softkeys.freaked.model;

import com.orm.SugarRecord;

/**
 * Created by junio on 03/06/16.
 */
public class Institution extends SugarRecord {
    private String nameInstitution;
    private String cnpj;
    private PersonResponsable person;

    public Institution(){

    }

    public Institution(String nameInstitution, String cnpj, PersonResponsable person){
        this.setNameInstitution(nameInstitution);
        this.setCnpj(cnpj);
        this.setPerson(person);
    }

    public String getNameInstitution() {
        return nameInstitution;
    }

    public void setNameInstitution(String nameInstitution) {
        this.nameInstitution = nameInstitution;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PersonResponsable getPerson() {
        return person;
    }

    public void setPerson(PersonResponsable person) {
        this.person = person;
    }
}
