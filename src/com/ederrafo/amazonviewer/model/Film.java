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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
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

    public String isViewed() {
        String visto = "No";
        if(viewed == true){
            visto = "Si";
        }
        return visto;
        // Alternatives
        // return viewed ? "Yes" : "No";
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }


}
