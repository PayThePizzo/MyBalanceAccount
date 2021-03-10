package org.example.model;

//Class modelling the main DB schema

import java.time.LocalDate;

public class Wallet {
    //Fields
    private int id;
    private int amount;
    private String []description;
    private LocalDate date;

    //Constructor
    Wallet(int id, int amount, String[]description, LocalDate date){
        setId(id);
        setAmount(amount);
        setDescription(description);
        setDate(date);
    }

    //Setters & Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String[] getDescription() {
        return description;
    }

    public void setDescription(String[] description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    //CRUD - Create Return Update Delete



}
