package com.example.myapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class MusicList extends AppCompatActivity {

    private ListView list;
    ArrayList<String> arrayList;
    ArrayAdapter asniAdapter;
    MediaPlayer asniPlayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musicselect);
        list=(ListView)findViewById(R.id.list);

        arrayList = new ArrayList<>();
        Field[] fields=R.raw.class.getFields();
        for(int i=0;i<fields.length;i++){
            arrayList.add(fields[i].getName());
        }
        asniAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        list.setAdapter(asniAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (asniPlayer != null) {
                    asniPlayer.release();
                }
                int resId = getResources().getIdentifier(arrayList.get(i), "raw", getPackageName());



            }
        });


    }
}
