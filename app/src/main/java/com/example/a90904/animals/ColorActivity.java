package com.example.a90904.animals;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
    }

    public void btn1(View view) {
        Toast.makeText(ColorActivity.this, "I am not small！", Toast.LENGTH_LONG).show();
    }

    public void btn2(View view) {
        Toast.makeText(ColorActivity.this, "I live in land！", Toast.LENGTH_LONG).show();
    }

    public void btn3(View view) {
        Toast.makeText(ColorActivity.this, "I eat meat！", Toast.LENGTH_LONG).show();
    }

    public void btn4(View view) {
        Toast.makeText(ColorActivity.this, "I'm good at hunting！", Toast.LENGTH_LONG).show();
    }

    public void btn5(View view) {
        Toast.makeText(ColorActivity.this, "Other animals are afraid of me！", Toast.LENGTH_LONG).show();
    }

    public void btn6(View view) {
        Toast.makeText(ColorActivity.this, "I'm the king！", Toast.LENGTH_LONG).show();
    }

    public void btn7(View view) {
        Toast.makeText(ColorActivity.this, "Congratulations！", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(ColorActivity.this,SucActivity.class);

        startActivity(intent);
    }

    public void btn8(View view) {
        Toast.makeText(ColorActivity.this, "I'm strong！", Toast.LENGTH_LONG).show();
    }

    public void btn9(View view) {
        Toast.makeText(ColorActivity.this, "My ancestor is the same as cat's！", Toast.LENGTH_LONG).show();
    }
}
