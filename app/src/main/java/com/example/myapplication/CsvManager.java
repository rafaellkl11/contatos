package com.example.myapplication;

import android.content.Context;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvManager {

    private static final String ARQUIVO = "usuarios.csv";

    public static void salvarUsuario(Context context, Usuario usuario) {

        try {

            FileOutputStream fos =
                    context.openFileOutput(
                            ARQUIVO,
                            Context.MODE_APPEND);

            OutputStreamWriter osw =
                    new OutputStreamWriter(fos);

            osw.write(
                    usuario.getNome() + "," +
                            usuario.getEmail() + "," +
                            usuario.getTelefone() + "," +
                            usuario.getFoto() + "\n");

            osw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Usuario> listarUsuarios(Context context) {

        List<Usuario> lista = new ArrayList<>();

        try {

            FileInputStream fis =
                    context.openFileInput(ARQUIVO);

            BufferedReader br =
                    new BufferedReader(
                            new InputStreamReader(fis));

            String linha;

            while ((linha = br.readLine()) != null) {

                String[] dados =
                        linha.split(",");

                if(dados.length >= 4) {

                    Usuario usuario =
                            new Usuario(
                                    dados[0],
                                    dados[1],
                                    dados[2],
                                    dados[3]);

                    lista.add(usuario);
                }
            }

            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}