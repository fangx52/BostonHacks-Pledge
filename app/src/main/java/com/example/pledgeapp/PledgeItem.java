package com.example.pledgeapp;

import java.util.ArrayList;
import java.util.Date;

public class PledgeItem {

    // Member variables representing properties of a pledge.

    private int id;
    private String category;
    private String pledge;
    private Date startDate;
    private Date endDate;
    private String penalty;
    private ArrayList<String> phoneNumbers;

    // Constructor for PledgeItem object.

    public PledgeItem(int id, String category, String pledge, Date startDate, Date endDate, String penalty, ArrayList<String> phoneNumbers) {

        this.id = id;
        this.category = category;
        this.pledge = pledge;
        this.startDate = startDate;
        this.endDate = endDate;
        this.penalty = penalty;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPledge() {
        return pledge;
    }

    public void setPledge(String pledge) {
        this.pledge = pledge;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }

    public ArrayList<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(ArrayList<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

}


