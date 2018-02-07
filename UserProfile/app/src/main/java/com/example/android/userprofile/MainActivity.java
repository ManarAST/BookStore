package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView Name = (TextView) findViewById(R.id.name);
        Name.setText("Manar");
        TextView Birthday = (TextView) findViewById(R.id.birthday);
        Birthday.setText("30/11/1993");
        TextView Country = (TextView) findViewById(R.id.country);
        Country.setText("KSA");
        ImageView ProfilePic = (ImageView)findViewById(R.id.profile_picture);
        ProfilePic.setImageResource(R.drawable.profilePic);
    }
}
