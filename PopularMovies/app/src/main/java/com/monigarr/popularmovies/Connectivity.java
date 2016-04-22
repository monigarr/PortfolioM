/*
 * Copyright (c) 2016.
 */

package com.monigarr.popularmovies;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

/**
 * Created by monicapeters on 4/21/16.
 */
public class Connectivity {

    public static boolean isConnected(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if(networkInfo != null && networkInfo.isConnected()) {
            Log.d("Connectivity", "Connected");
            return true;
        } else {
            Log.d("Connectivity", "Not Connected");
            return false;
        }
    }
}
