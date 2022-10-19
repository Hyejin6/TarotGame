package com.example.tarotgame;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class FinalActivity extends AppCompatActivity  {

    ImageView tarotImg;
    TextView tarotTitle, tarotStr, tarotTag;
    Button resetBtn, closeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tarot_layout);

        tarotImg = (ImageView) findViewById(R.id.tarotImg);
        tarotTitle = (TextView) findViewById(R.id.tarotTitle);
        tarotStr = (TextView) findViewById(R.id.tarotStr);
        tarotTag = (TextView) findViewById(R.id.tarotTag);
        resetBtn = (Button) findViewById(R.id.resetBtn);
        closeBtn = (Button) findViewById(R.id.closeBtn);

        Intent intent = getIntent();
        String reTitle = intent.getStringExtra("rTitle");
        String reStr = intent.getStringExtra("rStr");
        String reTag = intent.getStringExtra("rTag");
        int reImg = intent.getIntExtra("rImg", 0);

        tarotTitle.setText(reTitle);
        tarotStr.setText(reStr);
        tarotTag.setText(reTag);
        tarotImg.setImageResource(reImg);

        Intent intent1 = getIntent();
        String title = intent1.getStringExtra("title");
        String str = intent1.getStringExtra("str");
        String tag = intent1.getStringExtra("tag");
        int img = intent1.getIntExtra("img", 0);

        tarotTitle.setText(title);
        tarotStr.setText(str);
        tarotTag.setText(tag);
        tarotImg.setImageResource(img);

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), MenuActivity.class);
                startActivity(intent1);
                finish();
            }
        });

        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popup();
            }
        });

    }

    // 앱 종료
    void popup() {
        AlertDialog.Builder msgBuilder = new AlertDialog.Builder(FinalActivity.this)
                .setTitle("알림")
                .setMessage("앱을 종료하시겠습니까?")
                .setPositiveButton("종료", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        // 앱 완전 종료
                        moveTaskToBack(true); // 현재 액티비티 종료
                        finishAndRemoveTask(); // 액티비티를 종료시키면서 해당 앱을 최근사용목록에서 지움
                        android.os.Process.killProcess(android.os.Process.myPid()); // 앱 프로세스 종료
                    }
                })
                .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog msgDlg = msgBuilder.create();
        msgDlg.show();
    }
}
