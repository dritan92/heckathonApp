package com.example.saida.heckathonapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class CoinActivity extends AppCompatActivity {

    Button b_flip;

    ImageView iv_coin;

    Random r;


    int coinside; //0-heads, 1 tails


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin);

        b_flip = (Button) findViewById(R.id.b_flip);
        iv_coin = (ImageView) findViewById(R.id.iv_icon);
        r = new Random();

        b_flip.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                coinside = r.nextInt(4);
                if(coinside == 0){
                    iv_coin.setImageResource(R.drawable.head);
                    Toast.makeText(CoinActivity.this,"Head",Toast.LENGTH_SHORT).show();
                }
                else if(coinside == 1){
                    iv_coin.setImageResource(R.drawable.tail);
                    Toast.makeText(CoinActivity.this, "Tail",Toast.LENGTH_SHORT).show();
                }
                RotateAnimation rotate = new RotateAnimation(0, 300,
                        RotateAnimation.RELATIVE_TO_SELF,0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                rotate.setDuration(1000);
                iv_coin.setAnimation(rotate);

            }
        });
    }

}
