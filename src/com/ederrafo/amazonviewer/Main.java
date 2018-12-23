package com.ederrafo.amazonviewer;

import com.ederrafo.amazonviewer.model.Movie;

public class Main {
    public static void main(String[] args)
    {
        // instanciado el objeto puesto en memoria
//        Movie movie = new Movie();
//        System.out.println("movie : " + movie);
//        Movie movie2 = new Movie();
//        System.out.println("movie 2: s" + movie2);

        Movie movie = new Movie("mito", "accion", "eder", 234, (short)2018);
        System.out.println("movie :" + movie);

    }
}
