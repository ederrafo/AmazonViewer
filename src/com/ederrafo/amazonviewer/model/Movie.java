package com.ederrafo.amazonviewer.model;

import com.ederrafo.amazonviewer.interfaces.IVisualizable;

import java.util.Date;

public class Movie extends Film implements IVisualizable {

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
        return "Title: " + getTitle() + "\n Genre: " + getGenre() + "\n Year:" + getYear();
    }

    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
        setTimeViewed(0);
        if(dateF.getSeconds() > dateI.getSeconds()){
            setTimeViewed(dateF.getSeconds() - dateI.getSeconds());
        }
    }
}
