package com.example.tarotgame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class TarotAdapter extends BaseAdapter {

    Context context;
    LayoutInflater layoutInflater;
    ArrayList<TarotData> tarotData;

    public TarotAdapter(Context context, ArrayList<TarotData> tarotData) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(context);
        this.tarotData = tarotData;
    }

    @Override
    public int getCount() {
        return tarotData.size();
    }

    @Override
    public Object getItem(int position) {
        return tarotData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = layoutInflater.inflate(R.layout.tarot_select_layout, null);

        return view;  //뷰 객체 반환
    }
}

