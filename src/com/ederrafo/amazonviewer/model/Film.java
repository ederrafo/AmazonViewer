package com.ederrafo.amazonviewer.model;

public class Film {
    public String title;
    public String genre;
    public String creator;
    public int duration;
    public short year;
    public boolean viewed;

    // Lo minimo que se necesita para que un objeto Film se genere
    public Film(String title, String genre, String creator, int duration) {
        this.title   = title;
        this.genre    = genre;
        this.creator  = creator;
        this.duration = duration;
    }

    public String gettitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }


}
