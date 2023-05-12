package com.example.swapperandchecker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class Checker extends AppCompatActivity {

    TextView checkTheMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checker);

        checkTheMessage = findViewById(R.id.checkmessage);

        String first_content = getIntent().getStringExtra("firstContent");
        String second_content = getIntent().getStringExtra("secondContent");

        if (first_content.equals(second_content) ){
            checkTheMessage.setText("SAME!");
        }

        else {
            checkTheMessage.setText("NOT THE SAME!");
        }

    }

}