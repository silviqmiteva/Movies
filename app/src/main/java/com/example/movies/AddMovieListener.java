package com.example.movies;

import com.example.movies.Movie;

public interface AddMovieListener {
    void addFinishDialog(Movie movie);
    void removeMovie(Movie mov);
}
