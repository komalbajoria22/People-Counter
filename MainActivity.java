package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView countdown;
    Button reset,plusone;

    public void reset(View view){

        countdown.setText("00");
    }



    public void plusone(View view){

         int initial=Integer.parseInt(countdown.getText().toString());
         initial++;
         countdown.setText(Integer.toString(initial));
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reset=(Button)findViewById(R.id.reset);
        plusone=(Button)findViewById(R.id.plusone);
        countdown=(TextView)findViewById(R.id.countdown);
    }
}