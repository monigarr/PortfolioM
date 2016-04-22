/*
 * Copyright (c) 2016.
 */

package com.monigarr.popularmovies;


/*
*  Parcelable is 10x faster & uses less resources
*  than Serializable
*  http://www.developerphil.com/parcelable-vs-serializable/
*/


/**
 * Created by monicapeters on 4/21/16.
 */
/*
public class MovieItem implements Parcelable {

    int id;
    String movieTitle;
    String moviePoster;
    String moviePlot;
    double movieRating;
    String movieReleaseDate;
    private static String TAG = MovieItem.class.getSimpleName();

    MovieItem(Parcel in) {
        this.id = in.readInt();
        this.movieTitle = in.readString();
        this.moviePoster = in.readString();
        this.moviePlot = in.readString();
        this.movieRating = in.readDouble();
        this.movieReleaseDate = in.readString();
    }
/*
    @Override
    void writeToParcel(Parcel destination, int flags) {
        destination.writeInt(id);
        destination.writeString(movieTitle);
        destination.writeString(moviePoster);
        destination.writeString(moviePlot);
        destination.writeDouble(movieRating);
        destination.writeString(movieReleaseDate);
    }

    @Override
    int describeContents() {
        return 0;
    }

    static final Parcelable.Creator<MovieItem> CREATOR
            = new Parcelable.Creator<MovieItem>() {

        MovieItem createFromParcel(Parcel in) {
            return new MovieItem(in);
        }

        MovieItem[] newArray(int size) {
            return new MovieItem[size];
        }
    };
*/
/*}*/