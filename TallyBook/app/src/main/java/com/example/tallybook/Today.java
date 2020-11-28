package com.example.tallybook;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Today extends AppCompatActivity {
    TextView date_textview,week_textview;
    ImageButton btn_return,btn_add;
    final Calendar calendar = Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.today_layout);
        date_textview = (TextView)findViewById(R.id.date_textview);
        btn_return = (ImageButton)findViewById(R.id.btn_return);
        btn_add = (ImageButton)findViewById(R.id.btn_add);
        SimpleDateFormat Mouth_date= new SimpleDateFormat("MM");
        SimpleDateFormat Today_date= new SimpleDateFormat("dd");
        date_textview.setText("今天"+Mouth_date.format(new Date())+"月"+Today_date.format(new Date())+"日");
    }

    public void returnClick(View view){
        Today.this.finish();
    }
    public void addClick(View view){
        week_textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Today.this, "记一笔", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
