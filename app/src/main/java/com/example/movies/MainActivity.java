package com.example.movies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements AddMovieListener {
    RecyclerView recyclerView;
    MovieAdapter movieAdapter;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        fab = findViewById(R.id.fabBtn);
        MovieCollection movies = new MovieCollection();
        movieAdapter = new MovieAdapter(movies.getMovies());
        recyclerView.setAdapter(movieAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                MovieFragment addMovieFragment = MovieFragment.newInstance();
                addMovieFragment.show(fm,"");
            }
        });
    }

    @Override
    public void addFinishDialog(Movie mov){
        movieAdapter.addMovie(mov);
        movieAdapter.notifyDataSetChanged();
    }


}
