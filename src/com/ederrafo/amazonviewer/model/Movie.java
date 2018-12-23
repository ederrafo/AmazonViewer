package com.ederrafo.amazonviewer.model;

public class Movie extends Film{

    private int id;
    private int timeViewed;

    public Movie(String tittle, String genre, String creator, int duration, short year) {
        // Con super estamos haciendo referencia a la clase padre
        super(tittle, genre, creator, duration);
        setYear(year);

    }

    public int getId() {
        return id;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    @Override
    public String toString() {
        //return super.toString();
        return "Title: " + gettitle() + "\n Genre: " + getGenre() + "\n Year:" + getYear();
    }
}
