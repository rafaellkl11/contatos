package com.example.myapplication;

public class ConsultaActivity extends AppCompatActivity {

    ListView listaUsuarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta);

        listaUsuarios =
                findViewById(R.id.listaUsuarios);

        List<Usuario> usuarios =
                CsvManager.listarUsuarios(this);

        ArrayList<String> dados =
                new ArrayList<>();

        for (Usuario u : usuarios) {

            dados.add(
                    "Nome: " + u.getNome() +
                            "\nEmail: " + u.getEmail() +
                            "\nTelefone: " + u.getTelefone()
            );
        }

        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(
                        this,
                        android.R.layout.simple_list_item_1,
                        dados);

        listaUsuarios.setAdapter(adapter);
    }
}