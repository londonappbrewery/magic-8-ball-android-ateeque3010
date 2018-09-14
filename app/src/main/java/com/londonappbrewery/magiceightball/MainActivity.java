package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView monitor;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monitor=findViewById(R.id.monitor);
        button=findViewById(R.id.button);

        final  int arrayMode[]={R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {



               Random random=new Random();
               int num=random.nextInt(5);
               monitor.setImageResource(arrayMode[num]);
           }
       });
    }
}
