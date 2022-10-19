package com.example.tarotgame;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class SelectActivity extends AppCompatActivity {

    ListView tarotList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        Intent intent = getIntent();
        ArrayList<TarotData> tarotDataList = (ArrayList<TarotData>) intent.getSerializableExtra("tarot");

        tarotList = (ListView) findViewById(R.id.tarotList);
        TarotAdapter tarotAdapter = new TarotAdapter(this, tarotDataList);

        tarotList.setAdapter(tarotAdapter);

        tarotList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent cardIntent = new Intent(getApplicationContext(), FinalActivity.class);
                cardIntent.putExtra("title", tarotDataList.get(position).getTarotName());
                cardIntent.putExtra("str", tarotDataList.get(position).getTarotStr());
                cardIntent.putExtra("tag", tarotDataList.get(position).getTarotTag());
                cardIntent.putExtra("img", tarotDataList.get(position).getTarotImg());
                startActivity(cardIntent);
                finish();
            }
        });

    }


}
