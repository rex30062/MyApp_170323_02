package com.cclz.myapp_170323_02;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v){
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("對話框測試");
        builder.setMessage("這是一個對話框測試");
        builder.setPositiveButton("確定", new DialogInterface.OnClickListener() { // 確定按鈕
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.d("DLG", "使用者按下確定");
            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() { // 取消按鈕
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.d("DLG", "使用者按下取消");
            }
        });
        builder.setNeutralButton("看說明", new DialogInterface.OnClickListener() { // 中立按鈕
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Log.d("DLG", "使用者按下看說明");
            }
        });
        builder.show();
    }
}
