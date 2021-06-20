package com.example.myapplication ;



import android.app.TabActivity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.Toast;

import com.example.myapplication.R;

@SuppressWarnings("deprecation")
public class SubActivity extends TabActivity {
    //MediaPlayer player;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Button button=(Button)findViewById(R.id.back);
        final MediaPlayer[] player = {MediaPlayer.create(this, R.raw.run)};
        String[] mid = { "숲을달리는소리", "새소리2", "새소리1", "세소리3", "시냇물소리", "잔잔한시냇물","연못소리","빗소리1","빗소리2","산속 걷는소리"
        };
        String[] mid2={"겨울바다 바람소리","바다 동굴속 바람소리","해변가 파도소리","해변가 바다소리2","해변가 파도소리","모래 해변가 파도소리","자갈 해변가 파도소리"};
        String[] mid3={"청보리밭 바람소리","대나무숲 바람소리","평원 바람소리1","평원 바람소리2","갈대밭 바람소리","처마밑 비소리","사찰에 물떨어지는 소리","시골 챔새","시골 병아리","시골 오리"};
        int[] song = { R.raw.run,R.raw.bird1,R.raw.bird2,R.raw.bird3,R.raw.waterfall1,R.raw.waterfall2,R.raw.pond,R.raw.rain1,R.raw.rain2,R.raw.park1};
        int[] song2={R.raw.wind1,R.raw.cave,R.raw.sea1,R.raw.sea2,R.raw.sea3,R.raw.sea3,R.raw.sea4,R.raw.sea5};
        int[] song3={R.raw.rural_wind1,R.raw.rural_wind2,R.raw.rural_wind3,R.raw.rural_wind4,R.raw.rural_wind5,R.raw.rural_rain,R.raw.rural_water,R.raw.rural_bird,R.raw.rural_chick,R.raw.rural_duck};

        ListView list = (ListView) findViewById(R.id.listView1);
        ListView list2 = (ListView) findViewById(R.id.listView2);
        ListView list3 = (ListView) findViewById(R.id.listView3);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, mid);
        list.setAdapter(adapter);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, mid2);
        list2.setAdapter(adapter2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, mid3);
        list3.setAdapter(adapter3);
        //final MediaPlayer player;
        //player=MediaPlayer.create(this, R.raw.song1);
        //MediaPlayer.c
        TabHost tabHost = getTabHost();

        TabSpec tabSpecSong = tabHost.newTabSpec("SONG").setIndicator("산");
        tabSpecSong.setContent(R.id.tabSong);
        tabHost.addTab(tabSpecSong);

        TabSpec tabSpecArtist = tabHost.newTabSpec("ARTIST").setIndicator("바다");
        tabSpecArtist.setContent(R.id.tabArtist);
        tabHost.addTab(tabSpecArtist);

        TabSpec tabSpecAlbum = tabHost.newTabSpec("ALBUM").setIndicator("그외");
        tabSpecAlbum.setContent(R.id.tabAlbum);
        tabHost.addTab(tabSpecAlbum);

        TabSpec tabSpecBack = tabHost.newTabSpec("ALBUM").setIndicator("이전");
        tabSpecBack.setContent(R.id.back);
        tabHost.addTab(tabSpecBack);

        tabHost.setCurrentTab(0);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {

                // final MediaPlayer player;
                //player=MediaPlayer.create(getApplicationContext(), song[arg2]);
                if(player[0].isPlaying())
                    player[0].stop();
                else {
                    player[0] =MediaPlayer.create(getApplicationContext(), song[arg2]);
                    player[0].start();
                }
            }
        });

        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {

                // final MediaPlayer player;
                //player=MediaPlayer.create(getApplicationContext(), song[arg2]);
                if(player[0].isPlaying())
                    player[0].stop();
                else {
                    player[0] =MediaPlayer.create(getApplicationContext(), song2[arg2]);
                    player[0].start();
                }
            }
        });
        list3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {

                // final MediaPlayer player;
                //player=MediaPlayer.create(getApplicationContext(), song[arg2]);
                if(player[0].isPlaying())
                    player[0].stop();
                else {
                    player[0] =MediaPlayer.create(getApplicationContext(), song3[arg2]);
                    player[0].start();
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
           }
        });


    }
}
