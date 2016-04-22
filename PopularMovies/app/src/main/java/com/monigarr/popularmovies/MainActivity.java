/*
 * Copyright (c) 2016.
 */

package com.monigarr.popularmovies;
/*
*   Udacity NanoDegree Plus
*   Popular Movies Stage 1
*
*   Upon launch, present user with grid of movie posters.
*
*   Allow user to change sort order via a setting:
*       sort order can be by most popular, or by top rated
*
*   Allow user to tap on movie poster and transition to a
*   details screen with additional info such as:
*       original title
*       movie poster image thumbnail
*       A plot synopsis (called overview in the api)
*       user rating (called vote_average in the api) release date
*
 */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                // send intent to DetailViewActivity
                Intent i = new Intent(getApplicationContext(), DetailViewActivity.class);

                // pass image index
                i.putExtra("id", position);
                i.putExtra("movieTitle", "test title");
                i.putExtra("moviePlot", "test movie plot text");
                i.putExtra("movieRating", "5 Stars");
                startActivity(i);
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton sortAZ = (FloatingActionButton) findViewById(R.id.sortAZ);
        sortAZ.setTag("Sorting A to Z");

        FloatingActionButton sortPopular = (FloatingActionButton) findViewById(R.id.sortPopular);
        sortPopular.setTag("Sorting Most Popular");

    }

    public void showSnackBar(View view) {
        FloatingActionButton button = (FloatingActionButton) view;
        String buttonText = (String) button.getTag();
        String buttonAction = (String) button.getTag();

        Context context = getApplicationContext();

        CharSequence text = buttonText;
        Snackbar.make(view, text, Snackbar.LENGTH_LONG).setAction(buttonAction, null).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

   /*might use in stage 2 of this project @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    */
}
