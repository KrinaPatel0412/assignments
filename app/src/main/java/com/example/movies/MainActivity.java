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
        moviesList.add(new Movie(1, "Joker", 8.5, "In Gotham City, mentally troubled comedian Arthur Fleck is disregarded and mistreated by society. He then embarks on a downward spiral of revolution and bloody crime. This path brings him face-to-face with his alter-ego: the Joker.", R.drawable.joker));
        moviesList.add(new Movie(2, "Avengers: Endgame", 8.4, "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.", R.drawable.endgame));
        moviesList.add(new Movie(3, "Greenland", 6.4, "A family struggles for survival in the face of a cataclysmic natural disaster.", R.drawable.greenland));
        moviesList.add(new Movie(4, "Blade Runner 2049", 8.0, "Young Blade Runner K's discovery of a long-buried secret leads him to track down former Blade Runner Rick Deckard, who's been missing for thirty years.", R.drawable.blade_runner));
        moviesList.add(new Movie(5, "Enola Holmes", 6.6, "When Enola Holmes-Sherlock's teen sister-discovers her mother missing, she sets off to find her, becoming a super-sleuth in her own right as she outwits her famous brother and unravels a dangerous conspiracy around a mysterious young Lord.", R.drawable.enola_holmes));
        movieAdapter = new MovieAdapter(moviesList);
        listView.setAdapter(movieAdapter);
    }
}