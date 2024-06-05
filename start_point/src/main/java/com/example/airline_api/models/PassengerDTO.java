package com.example.airline_api.models;

import java.util.List;

public class PassengerDTO {

    private String name;
    private String email;
    private List<Long> bookingIds;

    public PassengerDTO(String name, String email, List<Long> bookingIds) {
        this.name = name;
        this.email = email;
        this.bookingIds = bookingIds;
    }

    public PassengerDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getBookingIds() {
        return bookingIds;
    }

    public void setBookingIds(List<Long> bookingIds) {
        this.bookingIds = bookingIds;
    }
}
