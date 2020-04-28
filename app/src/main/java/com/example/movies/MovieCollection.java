package com.example.movies;

import java.util.ArrayList;

public class MovieCollection {
    private ArrayList<Movie> movies;

    public MovieCollection(){
        this.movies = new ArrayList<Movie>();
    }
    public ArrayList<Movie> getMovies(){
        return movies;
    }
}
