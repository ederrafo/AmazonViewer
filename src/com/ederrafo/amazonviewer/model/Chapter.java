package com.ederrafo.amazonviewer.model;

public class Chapter extends Movie{

    int id;
    int sessionNumber;

    public Chapter(String tittle, String genre, String creator, int duration, short year, int sessionNumber) {
        super(tittle, genre, creator, duration, year);
        this.sessionNumber = sessionNumber;
    }

    public int getSessionNumber() {
        return sessionNumber;
    }

    public void setSessionNumber(int sessionNumber) {
        this.sessionNumber = sessionNumber;
    }

    // Polimorfismo
    @Override
    public int getId() {
        return this.id;
    }
}
