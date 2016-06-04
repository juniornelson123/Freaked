package com.project.softkeys.freaked.model;

import com.orm.SugarRecord;

/**
 * Created by junio on 04/06/16.
 */
public class Announcement extends SugarRecord {
    private byte[] photo;
    private String title;
    private String description;
    private String cep;
    private String state;
    private String city;
    private TypeAnnouncement type;
    private User user;
    private Category category;

    public Announcement(){

    }

    public Announcement(String title,String description,String cep,String state,String city,TypeAnnouncement type,User user,Category category){

        this.setTitle(title);
        this.setDescription(description);
        this.setCep(cep);
        this.setState(state);
        this.setCity(city);
        this.setType(type);
        this.setUser(user);
        this.setCategory(category);
    }

    public Announcement(String title,String description,String cep,String state,String city,TypeAnnouncement type,User user,Category category,byte[] photo){

        this.setTitle(title);
        this.setDescription(description);
        this.setCep(cep);
        this.setState(state);
        this.setCity(city);
        this.setType(type);
        this.setUser(user);
        this.setCategory(category);
        this.setPhoto(photo);
    }


    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

    public TypeAnnouncement getType() {
        return type;
    }

    public void setType(TypeAnnouncement type) {
        this.type = type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
