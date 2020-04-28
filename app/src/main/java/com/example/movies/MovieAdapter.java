package com.example.movies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<Movie> films;
    private Context context;

    public MovieAdapter(ArrayList<Movie> mov){
        this.films = mov;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inf = LayoutInflater.from(context);

        View movie = inf.inflate(R.layout.movie_layout,parent,false);
        ViewHolder holder = new ViewHolder(movie);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Movie mov = films.get(position);

        holder.setTitle(mov.getTitle());
        holder.setDirector(mov.getDirector());
        holder.setGenre(mov.getGenre());
        holder.setYear(mov.getYear());
        holder.setRating(mov.getRating());
        holder.getBtnRemove().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeMovie(mov);
            }
        });
    }

    @Override
    public int getItemCount() {
        return films.size();
    }

    public void addMovie(Movie mov){
        films.add(mov);
    }

    public void removeMovie(Movie mov) {
        films.remove(mov);
        notifyDataSetChanged();
    }

}
