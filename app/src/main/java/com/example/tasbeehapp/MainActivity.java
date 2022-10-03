package com.example.tasbeehapp;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6;
    TextView selected, counter;
    Button count;
    int a=0,b=0,c=0,d=0,e=0,i=0;
    View Selected= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selected = findViewById(R.id.txtselect);
        counter = findViewById(R.id.txtcount);
        btn1 = findViewById(R.id.btnFatima);
        btn2 = findViewById(R.id.btnKalma);
        btn3 = findViewById(R.id.btnAstagfar);
        btn4 = findViewById(R.id.btnDarood);
        btn5 = findViewById(R.id.btnAyet);
        btn6 = findViewById(R.id.btnReset);
        count = findViewById(R.id.btncount);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selected.setText("Subhan-Allah");
                a=0;b=0;c=0;d=0;e=0;i=0;
                Selected=view;
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selected.setText("Say First Kalma");
                a=0;b=0;c=0;d=0;e=0;i=0;
                Selected=view;

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selected.setText("Say Astagfar");
                a=0;b=0;c=0;d=0;e=0;i=0;
                Selected=view;
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selected.setText("Say Darood");
                a=0;b=0;c=0;d=0;e=0;i=0;
                Selected=view;
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selected.setText("Say Ayet E Karima");
                a=0;b=0;c=0;d=0;e=0;i=0;
                Selected=view;
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c=0;
                Selected=null;
                selected.setText("Select Tasbih");
                counter.setText(""+c);
                a=0;b=0;c=0;d=0;e=0;i=0;

            }
        });

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Selected==null){
                    Toast.makeText(MainActivity.this,"please select Tasbih",Toast.LENGTH_SHORT).show();
                }else {
                    clicked(Selected);
                }
            }
        });

    }



    public void clicked(View view) {
        switch (view.getId()){
            case R.id.btnFatima:{

                if(c<33){
                    c++;
                    i++;
                    selected.setText("Subhan-Allah");
                    counter.setText(""+i);
                    if(c==33){
                        i=0;
                    }
                }else if(c<66){
                    c++;
                    i++;
                    selected.setText("Alhamulillah");
                    counter.setText(""+i);
                    if(c==66){
                        i=0;
                    }
                }else if(c<100){
                    c++;
                    i++;
                    selected.setText("Allah-o-Akbar");
                    counter.setText(""+i);
                    if(c==100){
                        i=0;
                        c=0;
                        Selected=null;
                        selected.setText("Select Tasbih");
                        counter.setText(""+i);
                    }
                }
            }break;
            case R.id.btnKalma:{
                if(a<100){

                    counter.setText(""+a);a++;
                }else{
                    a=0;
                    Selected=null;
                    selected.setText("Select Tasbih");
                    counter.setText(""+a);
                }
            }
            break;
            case R.id.btnAstagfar: {
                if(b<100){

                    counter.setText(""+b);
                    b++;
                }else{
                    b=0;
                    Selected=null;
                    selected.setText("Select Tasbih");
                    counter.setText(""+b);
                }
            }
            break;

            case R.id.btnDarood: {
                if(d<100){

                    counter.setText(""+d);
                    d++;
                }else{
                    c=d;
                    Selected=null;
                    selected.setText("Select Tasbih");
                    counter.setText(""+d);
                }

            }break;
            case R.id.btnAyet:{
                if(e<100){

                    counter.setText(""+e);
                    e++;
                }else{
                    e=0;
                    Selected=null;
                    selected.setText("Select Tasbih");
                    counter.setText(""+e);
                }
            }break;

        }

    }



}