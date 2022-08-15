package com.example.movies;

import android.app.Application;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Movie.class}, version =  1, exportSchema = false)
public abstract class MovieDataBase extends RoomDatabase {

    private static final String DB_NAME = "movie.db";
    private static MovieDataBase instance = null;

    public static MovieDataBase getInstance(Application application) {
        if(instance == null) {
            instance = Room.databaseBuilder(
                    application,
                    MovieDataBase.class,
                    DB_NAME
            ).build();
        }
        return instance;
    }

    abstract MovieDao movieDao();
}
