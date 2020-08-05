package com.example.hmandvlasov122endlessscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random = new Random();
        TextView txtWebsite = findViewById(R.id.txtWebsite);
        txtWebsite.setText(getString(R.string.txtWebsite,random.nextInt(100)));
    }
    public void clickButtonNext (View view) {
        Intent intent = new Intent(MainActivity.this,MainActivity.class);
        startActivity(intent);
    }
    public void clickButtonBack (View view) {
        finish();
    }
}
