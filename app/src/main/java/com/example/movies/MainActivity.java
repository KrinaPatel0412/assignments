package com.example.movies;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.movies.adapters.MovieAdapter;
import com.example.movies.models.Movie;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Movie> moviesList;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_view);
        moviesList = new ArrayList<>();
        movieAdapter = new MovieAdapter(moviesList);
        listView.setAdapter(movieAdapter);
    }
}