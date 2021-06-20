package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class AlarmActivity extends AppCompatActivity
{

    private AlarmManager alarmManager;
    private TimePicker timePicker;
    private PendingIntent pendingIntent;
    private Button btnselect;
    private Button btntimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);
        btnselect=findViewById(R.id.btnselect);


        btnselect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.example.myapplication.AlarmActivity.this, MusicList.class);
                startActivity(intent);
            }
        });

        this.alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        this.timePicker = findViewById(R.id.timePicker);

        findViewById(R.id.btnStart).setOnClickListener(mClickListener);
        findViewById(R.id.btnStop).setOnClickListener(mClickListener);
    }







    private void start() {

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.HOUR_OF_DAY, this.timePicker.getCurrentHour());
        calendar.set(Calendar.MINUTE, this.timePicker.getCurrentMinute());
        calendar.set(Calendar.SECOND, 0);


        if (calendar.before(Calendar.getInstance())) {

            calendar.add(Calendar.DATE, 1);
        }

        Intent intent = new Intent(this, com.example.myapplication.AlarmReceiver.class);

        intent.putExtra("state", "on");

        this.pendingIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);


        this.alarmManager.set(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), pendingIntent);


        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Toast.makeText(this, "Alarm : " + format.format(calendar.getTime()), Toast.LENGTH_SHORT).show();
    }


    private void stop() {
        if (this.pendingIntent == null) {
            return;
        }


        this.alarmManager.cancel(this.pendingIntent);


        Intent intent = new Intent(this, com.example.myapplication.AlarmReceiver.class);
        intent.putExtra("state","off");

        sendBroadcast(intent);

        this.pendingIntent = null;
    }

    View.OnClickListener mClickListener = new View.OnClickListener() {

        @SuppressLint("NonConstantResourceId")
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnStart:

                    start();

                    break;
                case R.id.btnStop:

                    stop();

                    break;
            }
        }
    };
}