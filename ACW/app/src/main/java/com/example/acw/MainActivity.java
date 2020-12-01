package com.example.acw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btOrc(View view){

        Intent Orc = new Intent(MainActivity.this, OrcamentoActivity.class);

        startActivity(Orc);

    }

    public void btTrab(View view){

        Intent Trab = new Intent(MainActivity.this, TrabalheActivity.class);

        startActivity(Trab);
    }
}
