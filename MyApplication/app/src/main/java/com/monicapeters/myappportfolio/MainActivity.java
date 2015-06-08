package com.monicapeters.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Context context = getApplicationContext();
    int toastDuration = Toast.LENGTH_SHORT;

    CharSequence spotifyText = "Spotify App Here";
    CharSequence scoresText = "Scores App Here";
    CharSequence libraryText = "Library App Here";
    CharSequence builditText = "Build It Bigger App Here";
    CharSequence xyzreaderText = "XYZ Reader App Here";
    CharSequence capstoneText = "Capstone App Here";*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //spotify streamer
        final Button spotifyButton = (Button) findViewById(R.id.spotify_button);
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Toast toast = Toast.makeText(context, spotifyText, toastDuration);
                toast.show();
            }
        });

        //scores app

        //library app

        //build it bigger app

        //xyz reader app

        //capstone app

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
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
}
