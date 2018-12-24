package com.ederrafo.amazonviewer.model;

import com.ederrafo.amazonviewer.interfaces.IVisualizable;

import java.util.Date;
//jalamos del JDK la libreria Dates


public class Book extends Publication implements IVisualizable {

    private int id;
    private String isbn;
    private boolean readed;
    private int timeReaded;

    public Book(String title, Date editionDate, String editorial, String[] authors) {
        super(title, editionDate, editorial);
        setAuthors(authors);
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isReaded() {
        return readed;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public int getTimeReaded() {
        return timeReaded;
    }

    public void setTimeReaded(int timeReaded) {
        this.timeReaded = timeReaded;
    }

    @Override
    public String toString() {
        String detailBook = "\n :: BOOK ::" +
                "\n Title: " + getTitle() +
                "\n Editorial: " + getEditorial() +
                "\n Edition Date: " + getEditionDate() +
                "\n Authors: ";
        for (int i = 0; i < getAuthors().length; i++) {
            detailBook += "\t" + getAuthors()[i];
        }
        return  detailBook;
    }

    @Override
    public Date startToSee(Date dateI) {
        return dateI;
    }

    @Override
    public void stopToSee(Date dateI, Date dateF) {
        setTimeReaded(0);
        if(dateF.getSeconds() > dateI.getSeconds()){
            setTimeReaded(dateF.getSeconds() - dateI.getSeconds());
        }
    }
}
