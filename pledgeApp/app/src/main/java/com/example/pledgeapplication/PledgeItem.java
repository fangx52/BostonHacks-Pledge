package com.example.pledgeapplication;


import java.util.ArrayList;

public class PledgeItem {

    // Member variables representing properties of a pledge.

    private String id;
    private String category;
    private String pledge;
    private String startDate;
    private String endDate;
    private String penalty;
    private ArrayList<String> phoneNumbers;

    // Constructor for PledgeItem object.

    public PledgeItem(String id, String category, String pledge, String startDate, String endDate, String penalty) {

        this.id = id;
        this.category = category;
        this.pledge = pledge;
        this.startDate = startDate;
        this.endDate = endDate;
        this.penalty = penalty;
        //this.phoneNumbers = phoneNumbers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }

//    public ArrayList<String> getPhoneNumbers() {
//        return phoneNumbers;
//    }

//    public void setPhoneNumbers(ArrayList<String> phoneNumbers) {
//        this.phoneNumbers = phoneNumbers;
//    }

}



