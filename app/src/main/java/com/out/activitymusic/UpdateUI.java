package com.out.activitymusic;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.ArrayList;

public class UpdateUI {
    private final String STORAGE = " com.valdioveliu.valdio.audioplayer.STORAGE";
    private SharedPreferences preferences;
    private Context context;


    public UpdateUI(Context context) {
        this.context = context;
    }

    public void UpdateTitle(String title) {
        preferences = context.getSharedPreferences(STORAGE, Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("title", title);
        editor.apply();
    }

    public String getTitle() {
        preferences = context.getSharedPreferences(STORAGE, Context.MODE_PRIVATE);

        String title = preferences.getString("title", null);

        return title;
    }

    public void UpdateArtist(String artist) {
        preferences = context.getSharedPreferences(STORAGE, Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("artist", artist);
        editor.apply();
    }

    public String getArtist() {
        preferences = context.getSharedPreferences(STORAGE, Context.MODE_PRIVATE);

        String artist = preferences.getString("artist", null);

        return artist;
    }
    public void UpdateAlbum(String album) {
        preferences = context.getSharedPreferences(STORAGE, Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("album", album);
        editor.apply();
    }

    public String getAlbum() {
        preferences = context.getSharedPreferences(STORAGE, Context.MODE_PRIVATE);

        String album = preferences.getString("album", null);

        return album;
    }
    public void UpdateIndex(int index) {
        preferences = context.getSharedPreferences(STORAGE, Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt("possision", index);
        editor.apply();
    }
    public int getIndex() {
        preferences = context.getSharedPreferences(STORAGE, Context.MODE_PRIVATE);

        int index = preferences.getInt("possision", -1);

        return index;
    }

}