package com.koksheng.procleanservicesserver.Model;


import java.util.List;

public class Request {

    private String phone;
    private String name;
    private String address;
    private String total;
    private String status;
    private String comment;
    private List<Order> cleanings; //list of cleaning order

    public Request(){

    }

    public Request(String phone, String name, String address, String total, String status, String comment, List<Order> cleanings) {
        this.phone = phone;
        this.name = name;
        this.address = address;
        this.total = total;
        this.status = status;
        this.comment = comment;
        this.cleanings = cleanings;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<Order> getCleanings() {
        return cleanings;
    }

    public void setCleanings(List<Order> cleanings) {
        this.cleanings = cleanings;
    }
}

