package com.ederrafo.amazonviewer.model;

import java.util.Date;

public class Magazine {
    int id;
    String title;
    Date editioDate;
    String editorial;
    String[] authors;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getEditioDate() {
        return editioDate;
    }

    public void setEditioDate(Date editioDate) {
        this.editioDate = editioDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
}
