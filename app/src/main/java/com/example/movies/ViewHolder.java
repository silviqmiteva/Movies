package com.example.movies;

import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView title;
    private TextView year;
    private TextView director;
    private TextView genre;
    private RatingBar rating;
    private Button btnRemove;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        this.title = itemView.findViewById(R.id.title);
        this.year = itemView.findViewById(R.id.year);
        this.director = itemView.findViewById(R.id.director);
        this.genre = itemView.findViewById(R.id.genre);
        this.rating = itemView.findViewById(R.id.stars);
        this.btnRemove = itemView.findViewById(R.id.removeBtn);
    }

    public TextView getTitle() {
        return title;
    }

    public TextView getYear() {
        return year;
    }

    public TextView getDirector() {
        return director;
    }

    public TextView getGenre() {
        return genre;
    }

    public Button getBtnRemove() {
        return btnRemove;
    }

    public RatingBar getRating() {
        return rating;
    }

    public void setTitle(String title) {
        this.title.setText(title);
    }

    public void setYear(String year) {
        this.year.setText(year);
    }

    public void setDirector(String director) {
        this.director.setText(director);
    }

    public void setGenre(String genre) {
        this.genre.setText(genre);
    }

    public void setRating(String rating) {
        this.rating.setRating(Float.parseFloat(rating));
    }
}
