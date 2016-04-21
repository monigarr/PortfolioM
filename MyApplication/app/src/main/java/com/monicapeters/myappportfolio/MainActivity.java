package com.monicapeters.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //spotify streamer
        Button spotifyButton = (Button) findViewById(R.id.spotify_button);
        spotifyButton.setText("Spotify App");


        //scores app
        Button scoresButton = (Button) findViewById(R.id.scores_button);
        scoresButton.setText("Scores App");

        //library app
        Button libraryButton = (Button) findViewById(R.id.library_button);
        libraryButton.setText("Library App");

        //build it bigger app
        Button builditbiggerButton = (Button) findViewById(R.id.builditbigger_button);
        builditbiggerButton.setText("Build It Bigger App");

        //xyz reader app
        Button xyzButton = (Button) findViewById(R.id.xyzreader_button);
        xyzButton.setText( "XYZ Reader App");

        //capstone app
        Button capstoneButton = (Button) findViewById(R.id.capstone_button);
        capstoneButton.setText("Capstone App");

    }

    public void displayToast(View view) {
        Button button = (Button) view;
        String buttonText = (String) button.getText();

        Context context = getApplicationContext();

        CharSequence text = getString(R.string.open_app) + buttonText;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
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
