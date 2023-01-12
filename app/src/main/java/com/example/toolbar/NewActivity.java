package com.example.toolbar;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class NewActivity extends AppCompatActivity {
    TextView txt;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        txt = findViewById(R.id.txt);
        intent = getIntent();
        txt.setText(intent.getStringExtra("msg"));
    }
}