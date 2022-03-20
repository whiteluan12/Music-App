package com.example.spotify_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set time for welcome text
        Calendar now = Calendar.getInstance();
        int hour = now.get((Calendar.HOUR_OF_DAY));

        welcome = (TextView) findViewById(R.id.welcome_txt);

        if(hour <= 11) welcome.setText("Chào buổi sáng");
        else if (hour <= 17) welcome.setText("Chào buổi chiều");
        else welcome.setText("Chào buổi tối");
    }
}