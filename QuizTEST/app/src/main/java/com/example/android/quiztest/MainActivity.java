package com.example.android.quiztest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;
import static android.R.attr.publicKey;

public class MainActivity extends AppCompatActivity {


    Button answer1, answer2, answer3, answer4;
    TextView score, question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);}

        public void Answer1 (View view){

    }

    public void Answer2 (View view){


    }
    public void Answer3 (View view){


    }
    public void Answer4 (View view){


    }


    }

