package com.example.a90904.animals;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.hellotext);
        AssetManager assets = getAssets();
//        Typeface fromAsset = Typeface.createFromAsset(assets, "Fonts/font_one.ttf");
//        textView.setTypeface(fromAsset);
    }

    public void btnStart(View view) {
        Intent intent = new Intent(MainActivity.this,ColorActivity.class);
        Toast.makeText(MainActivity.this, "Click for hints and find me！", Toast.LENGTH_LONG).show();
        startActivity(intent);
        //Toast.makeText(ColorActivity.this, "Click for hints and find me！", Toast.LENGTH_LONG).show();
    }

    
}
