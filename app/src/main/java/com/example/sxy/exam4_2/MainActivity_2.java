package com.example.sxy.exam4_2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

public class MainActivity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mian);
    }
    public void customView(View source){
        TableLayout loginForm=(TableLayout)getLayoutInflater()
                .inflate(R.layout.login,null);
        new AlertDialog.Builder(this)
                //.setIcon(R.drawable.tools)
                .setTitle("AlertDialog")
                .setView(loginForm)
                .setPositiveButton("登录", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                      //登录
                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //取消登录
                    }
                })
                .create()
                .show();
    }
}
