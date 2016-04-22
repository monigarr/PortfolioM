package com.monigarr.popularmovies;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/*
*   Allow user to tap on movie poster and transition to a
*   details screen with additional info such as:
*       original title
*       movie poster image thumbnail
*       A plot synopsis (called overview in the api)
*       user rating (called vote_average in the api) release date
*/

/**
 * Created by monicapeters on 4/21/16.
 */
public class DetailViewActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_view);

        // get intent data
        Intent i = getIntent();

        // image id
        int position = i.getExtras().getInt("id");
        String movieTitle = i.getExtras().getString("movieTitle");
        String moviePlot = i.getExtras().getString("moviePlot");
        String movieRating = i.getExtras().getString("movieRating");

        // movie title
        TextView movietitle = (TextView) findViewById(R.id.movieTitleTV);
        movietitle.setText(movieTitle);

        // movie poster
        ImageAdapter imageAdapter = new ImageAdapter(this);
        ImageView imageView = (ImageView) findViewById(R.id.DetailViewIV);
        imageView.setImageResource(imageAdapter.mThumbIds[position]);

        // movie rating
        TextView movierating = (TextView) findViewById(R.id.movieRatingTV);
        movierating.setText(movieRating);

        // movie plot
        TextView movieplot = (TextView) findViewById(R.id.moviePlotTV);
        movieplot.setText(moviePlot);
    }
}