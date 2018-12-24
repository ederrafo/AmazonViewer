package com.ederrafo.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publication {
    int id;

    public Magazine(String title, Date editionDate, String editorial) {
        super(title, editionDate, editorial);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString()
    {
        return  "\n :: MAGAZINE :: " +
                "\n Title: " + getTitle() +
                "\n Editorial: " + getEditorial() +
                "\n Edition Date: " + getEditionDate();
    }
}
