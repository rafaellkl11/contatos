package com.example.contatos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnIncluir;
    Button btnConsultar;
    Button btnImportar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIncluir = findViewById(R.id.btnIncluir);
        btnConsultar = findViewById(R.id.btnConsultar);
        btnImportar = findViewById(R.id.btnImportar);

        btnIncluir.setOnClickListener(v -> {
            Intent intent =
                    new Intent(MainActivity.this,
                            CadastroActivity.class);
            startActivity(intent);
        });

        btnConsultar.setOnClickListener(v -> {
            Intent intent =
                    new Intent(MainActivity.this,
                            ConsultaActivity.class);
            startActivity(intent);
        });

        btnImportar.setOnClickListener(v -> {

            // Aqui você pode abrir um seletor de arquivos CSV
            // ou chamar diretamente o método de importação.

        });
    }
}