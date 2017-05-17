package com.example.android.superphonic;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import android.widget.TextView;
import static com.example.android.superphonic.R.id.song1;
import static com.example.android.superphonic.R.id.song2;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the SearchView object
        SearchView mSearchView = (SearchView) findViewById(R.id.search_view);

        //get the ImageView object of the search icon from the SearchView object
        int searchImgId = getResources().getIdentifier("android:id/search_button", null, null);
        ImageView imageViewIcon = (ImageView) mSearchView.findViewById(searchImgId);
        //set the search icon image
        imageViewIcon.setImageResource(R.drawable.search30);

        //get the ImageView object of the close button from the SearchView object
        int searchImgClId = getResources().getIdentifier("android:id/search_close_btn", null, null);
        ImageView imageViewClose = (ImageView) mSearchView.findViewById(searchImgClId);
        //set the close button image
        imageViewClose.setImageResource(R.drawable.close30);

        //get the TextView object of the text from the SearchView object
        int id = getResources().getIdentifier("android:id/search_src_text", null, null);
        TextView textViewSearch = (TextView) mSearchView.findViewById(id);
        //set the SearchView text color
        textViewSearch.setTextColor(Color.parseColor("#FF4081"));


        LinearLayout songOneButton = (LinearLayout) findViewById(song1);
        //attach click listener to 1st Song view
        songOneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent intent = new Intent(view.getContext(), NowPlayingActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout songTwoButton = (LinearLayout) findViewById(song2);
        //attach click listener to 2nd Song view
        songTwoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent intent = new Intent(view.getContext(), NowPlayingActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout artistButton = (LinearLayout) findViewById(R.id.artist_view);
        //attach click listener to artist view
        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistActivity}
                Intent intent = new Intent(view.getContext(), ArtistActivity.class);
                startActivity(intent);
            }
        });

        LinearLayout albumButton = (LinearLayout) findViewById(R.id.album_view);
        //attach click listener to album view
        albumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent intent = new Intent(view.getContext(), NowPlayingActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout showAllSongs = (RelativeLayout) findViewById(R.id.songs_show_all);
        //attach click listener to show all songs button
        showAllSongs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent intent = new Intent(view.getContext(), SongsActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout showAllArtists = (RelativeLayout) findViewById(R.id.artists_show_all);
        //attach click listener to show all artists button
        showAllArtists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent intent = new Intent(view.getContext(), ArtistsActivity.class);
                startActivity(intent);
            }
        });

        RelativeLayout showAllAlbums = (RelativeLayout) findViewById(R.id.albums_show_all);
        //attach click listener to show all albums button
        showAllAlbums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link AlbumsActivity}
                Intent intent = new Intent(view.getContext(), AlbumsActivity.class);
                startActivity(intent);
            }
        });
    }
}
