package com.ederrafo.amazonviewer.model;

import java.util.ArrayList;

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

    public static ArrayList<Chapter> makeChaptersList() {
        ArrayList<Chapter> chapters = new ArrayList();

        for (int i = 1; i <= 5; i++) {
            chapters.add(new Chapter("Capituo "+i, "genero "+i, "creator" +i, 45, (short)(2017+i), i));
        }

        return chapters;
    }
}
