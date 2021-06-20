package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class RainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rain);
        final ViewFlipper vFlipper;
        RadioGroup rg;
        Button button1,button2,button3,button7;
        vFlipper=(ViewFlipper)findViewById(R.id.viewFliper1);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button3);
        button3=(Button)findViewById(R.id.button4);
        rg=(RadioGroup)findViewById(R.id.group);
        button7=(Button)findViewById(R.id.button7);
        TextView text8=(TextView)findViewById(R.id.textView8);
        TextView text9=(TextView)findViewById(R.id.textView9);
        TextView text10=(TextView)findViewById(R.id.textView10);
        TextView text11=(TextView)findViewById(R.id.textView11);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.showNext();
                int i=rg.getCheckedRadioButtonId();
                RadioButton radio=(RadioButton)findViewById(i);
                if(radio.getText().toString().equals("Red")){
                    text8.setText("당신의 색깔은");
                    text9.setText(radio.getText().toString());
                    text9.setTextColor(Color.parseColor("#F44336"));
                    text10.setText("혹시 오늘 기대하는 일이 있어 설레거나\n뭐든 할 수 있다는 자신간이 드는 날인가요?\n신나게 달리는 소리는 어떤가요?");
                    text11.setTextColor(Color.parseColor("#F44336"));
                    text11.setText("#자신감 #열정 #에너지 #모험");
                }
                if(radio.getText().toString().equals("Purple")){
                    text8.setText("당신의 색깔은");
                    text9.setText(radio.getText().toString());
                    text9.setTextColor(Color.parseColor("#673AB7"));
                    text10.setText("오늘 당신은 감정기복이 심하고\n어딘가 묘하게 예민한가요?\n잔잔한 소리는 어떤가요?");
                    text11.setTextColor(Color.parseColor("#673AB7"));
                    text11.setText("#릴렉스 #안정 #평화 #여유");
                }
                if(radio.getText().toString().equals("Yellow")){
                    text8.setText("당신의 색깔은");
                    text9.setText(radio.getText().toString());
                    text9.setTextColor(Color.parseColor("#FFEB3B"));
                    text10.setText("이상과 현실에서 고민이 되는 당신!\n제멋대로 변덕을 부리고 싶은 당신!\n당신을 위한 선물&새로운 취미를 추천합니다!");
                    text11.setTextColor(Color.parseColor("#FFEB3B"));
                    text11.setText("#변덕쟁이 #고민 #취미 #선물");
                }
                if(radio.getText().toString().equals("Blue")){
                    text8.setText("당신의 색깔은");
                    text9.setText(radio.getText().toString());
                    text9.setTextColor(Color.parseColor("#3244A8"));
                    text10.setText("요즘 당신의 일상에 리프레시가 필요한가요?\n파란하늘을 바라보며 여행계획을 세워보세요\n기분이 한결 나아질 거예요");
                    text11.setTextColor(Color.parseColor("#3244A8"));
                    text11.setText("#떠나자 #리프레시 #파란하늘 #여행");
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.showNext();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vFlipper.showNext();
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


}