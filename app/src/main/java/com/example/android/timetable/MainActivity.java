package com.example.android.timetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button updateButton;
    Button viewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateButton = (Button) findViewById(R.id.updater_button);
        viewButton = (Button)findViewById(R.id.viewer_button);
        update();
        viewer();
    }

    protected void update(){
        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, Update.class);
                startActivity(in);
            }
        });

    }

    protected void viewer() {
        viewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, Viewer.class);
                startActivity(in);
            }
        });
    }
}
