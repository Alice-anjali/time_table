package com.example.android.timetable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Update extends AppCompatActivity {

    Button ttButton;
    EditText noticeGetText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);


        ttButton = (Button) findViewById(R.id.ttButton);
        timeTable();
        noticeGetText = (EditText) findViewById(R.id.notice_get_text);
        getNotice();
    }


    protected void timeTable(){
        ttButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Update.this, TimeTable.class);
                startActivity(in);
            }
        });

    }

    protected void getNotice() {
        noticeGetText.getText();
    }


}
