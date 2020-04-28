package com.example.movies;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class MovieFragment extends DialogFragment implements View.OnClickListener {
    private EditText title;
    private EditText genre;
    private EditText year;
    private EditText director;
    private Button btnAdd;
    private RatingBar rating;

    AddMovieListener listener ;

    public MovieFragment() {
    }

    public static MovieFragment newInstance(){
        return new MovieFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_movie, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        title = view.findViewById(R.id.movTitle);
        genre = view.findViewById(R.id.movGenre);
        year = view.findViewById(R.id.movYear);
        director = view.findViewById(R.id.movDirector);
        btnAdd = view.findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);
        rating = view.findViewById(R.id.stars);
        title.requestFocus();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listener = (AddMovieListener) context;
    }

    @Override
    public void onClick(View v) {
        Movie movie = new Movie(title.getText().toString(),year.getText().toString(),genre.getText().toString(),director.getText().toString(),String.valueOf(rating.getRating()));
        listener.addFinishDialog(movie);
        dismiss();
    }
}
