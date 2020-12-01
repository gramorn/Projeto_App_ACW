package com.example.acw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class OrcamentoActivity extends AppCompatActivity {

    EditText nome, tel, email, info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orcamento);
    }

    public void btEnviarOrc(View view){
        Toast.makeText(getApplicationContext(), "Enviado com sucesso!", Toast.LENGTH_LONG).show();
    }
}