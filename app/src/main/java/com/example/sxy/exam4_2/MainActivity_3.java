package com.example.sxy.exam4_2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity_3 extends AppCompatActivity{
    final int font_10=0x111;
    final int font_12=0x112;
    final int font_14=0x113;
    final int font_16=0x114;
    final int font_18=0x115;
    //定义普通菜单项
    final int PLAIN_ITEM=0x11b;
    final int font_red=0x116;
    final int font_blue=0x117;
    final int font_green=0x118;
    private EditText edit;
    public void onCreate(Bundle bb){
        super.onCreate(bb);
        setContentView(R.layout.main_2);
        edit=(EditText)findViewById(R.id.txt);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        SubMenu fontMenu=menu.addSubMenu("字体大小");
        fontMenu.setIcon(R.drawable.color);
        fontMenu.setHeaderIcon(R.drawable.color);

        fontMenu.setHeaderTitle("请选择字体大小");
        fontMenu.add(0,font_10,0,"10号");
        fontMenu.add(0,font_12,0,"12号");
        fontMenu.add(0,font_14,0,"14号");
        fontMenu.add(0,font_16,0,"16号");
        fontMenu.add(0,font_18,0,"18号");

        menu.add(0,PLAIN_ITEM,0,"普通菜单");
        SubMenu colorMenu=menu.addSubMenu("字体颜色");
        colorMenu.setIcon(R.drawable.color);
        colorMenu.setHeaderIcon(R.drawable.color);

        colorMenu.setHeaderTitle("选择字体颜色");
        colorMenu.add(0,font_red,0,"红色");
        colorMenu.add(0,font_blue,0,"蓝色");
        colorMenu.add(0,font_green,0,"绿色");
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSeleted(MenuItem mi){
        switch (mi.getItemId()){
            case font_10:
                edit.setTextSize(10*2);
                break;
            case font_12:
                edit.setTextSize(12*2);
                break;
            case font_14:
                edit.setTextSize(14*2);
                break;
            case font_16:
                edit.setTextSize(16*2);
                break;
            case font_18:
                edit.setTextSize(18*2);
                break;
            case font_red:
                edit.setTextColor(Color.RED);
                break;
            case font_blue:
                edit.setTextColor(Color.BLUE);
                break;
            case font_green:
                edit.setTextColor(Color.GREEN);
                break;
            case PLAIN_ITEM:
                Toast toast=Toast.makeText(MainActivity_3.this,"您单击了普通菜单",Toast.LENGTH_SHORT);
                toast.show();
                break;
        }
        return true;
    }
}
