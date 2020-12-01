package com.example.acw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TrabalheActivity extends AppCompatActivity {

    EditText nome, tel, email, endereco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trabalhe);
    }

    public void btEnviarTrab(View view){
        Toast.makeText(getApplicationContext(), "Enviado com sucesso!", Toast.LENGTH_LONG).show();
    }
}