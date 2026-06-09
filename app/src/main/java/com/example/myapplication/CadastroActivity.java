package com.example.myapplication;

public class CadastroActivity extends AppCompatActivity {

    EditText edtNome;
    EditText edtEmail;
    EditText edtTelefone;
    Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        edtNome = findViewById(R.id.edtNome);
        edtEmail = findViewById(R.id.edtEmail);
        edtTelefone = findViewById(R.id.edtTelefone);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(v -> {

            Usuario usuario = new Usuario(
                    edtNome.getText().toString(),
                    edtEmail.getText().toString(),
                    edtTelefone.getText().toString(),
                    ""
            );

            CsvManager.salvarUsuario(
                    this,
                    usuario);

            Toast.makeText(
                    this,
                    "Usuário cadastrado!",
                    Toast.LENGTH_SHORT
            ).show();

            edtNome.setText("");
            edtEmail.setText("");
            edtTelefone.setText("");
        });
    }
}