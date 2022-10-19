package com.example.tarotgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button test1goBtn, test2goBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        test1goBtn = (Button) findViewById(R.id.test1goBtn);
        test2goBtn = (Button) findViewById(R.id.test2goBtn);

        test1goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), GameActivity.class);
                startActivity(intent1);
                finish();
            }
        });

        test2goBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(), GameActivity2.class);
                startActivity(intent2);
                finish();
            }
        });

    }
}