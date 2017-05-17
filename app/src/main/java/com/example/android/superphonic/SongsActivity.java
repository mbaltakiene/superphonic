package com.example.android.superphonic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        LinearLayout song1 = (LinearLayout) findViewById(R.id.song1_songs);
        //attach click listener to song button
        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent intent = new Intent(view.getContext(), NowPlayingActivity.class);
                startActivity(intent);
            }
        });
    }
}
