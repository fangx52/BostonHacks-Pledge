package com.example.pledgeapplication.ui.notifications;

public class DiscoverItem {

    // member variables
    private String location;
    private String title;
    private String info;
    private String date;
    //image
    private String link;

    // constructor
    public DiscoverItem(String location, String title, String info, String date, String link) {
        this.location = location;
        this.title = title;
        this.info = info;
        this.date = date;
        this.link = link;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDate() {
        return date;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
