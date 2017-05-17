package com.example.android.superphonic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        LinearLayout artistButton = (LinearLayout) findViewById(R.id.artist1_artists);
        //attach click listener to artist button
        artistButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistActivity}
                Intent intent = new Intent(view.getContext(), ArtistActivity.class);
                startActivity(intent);
            }
        });
    }
}
