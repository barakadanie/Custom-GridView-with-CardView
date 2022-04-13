package com.example.customgriviewwithcustomadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    GridView listView;
    List<Pojo> list;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list_view);
        listShow();
        myAdapter=new MyAdapter(this,list);
        listView.setAdapter(myAdapter);

    }
    private void listShow()
    {
        list=new ArrayList<>();
        list.add(new Pojo(R.drawable.ic_wifi,"Wifi","This is a wifi icon"));
        list.add(new Pojo(R.drawable.ic_access_alarm,"Alarm","This is an alarm Icon"));
        list.add(new Pojo(R.drawable.ic_battery_full,"Battery Full","This is battery full icon"));
        list.add(new Pojo(R.drawable.ic_bluetooth,"Bluetooth","This is a bluetooth icon"));
        list.add(new Pojo(R.drawable.ic_rotation,"Screen rotation","this is a screen rotation icon"));
        list.add(new Pojo(R.drawable.ic_wallpaper,"Wallpaper","This is a wallpaper icon"));
        list.add(new Pojo(R.drawable.ic_storage,"Storage","This is a storage icon"));
        list.add(new Pojo(R.drawable.ic_wifi,"Wifi","This is a wifi icon"));
        list.add(new Pojo(R.drawable.ic_access_alarm,"Alarm","This is an alarm Icon"));
        list.add(new Pojo(R.drawable.ic_battery_full,"Battery Full","This is battery full icon"));
        list.add(new Pojo(R.drawable.ic_bluetooth,"Bluetooth","This is a bluetooth icon"));
        list.add(new Pojo(R.drawable.ic_rotation,"Screen rotation","this is a screen rotation icon"));
        list.add(new Pojo(R.drawable.ic_wallpaper,"Wallpaper","This is a wallpaper icon"));
        list.add(new Pojo(R.drawable.ic_storage,"Storage","This is a storage icon"));
    }
}