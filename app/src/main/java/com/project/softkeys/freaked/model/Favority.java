package com.project.softkeys.freaked.model;

import com.orm.SugarRecord;

/**
 * Created by junio on 04/06/16.
 */
public class Favority extends SugarRecord {
    private User user;
    private Announcement announcement;

    public Favority(){

    }

    public Favority(User user, Announcement announcement){
        this.setUser(user);
        this.setAnnouncement(announcement);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Announcement getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(Announcement announcement) {
        this.announcement = announcement;
    }
}
