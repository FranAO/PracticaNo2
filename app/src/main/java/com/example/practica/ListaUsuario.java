package com.example.practica;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class ListaUsuario extends AppCompatActivity
{
    private ListView listViewUsuarios;
    private TextView tvMenuPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lista_usuario);

        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Rosa", "Melano", "", "rosa@gmail.com", "1234567"));
        usuarios.add(new Usuario("Benito", "Camelo", "", "benito@gmail.com", "1234567"));

        listViewUsuarios = findViewById(R.id.lvUuarios);
        tvMenuPrincipal = findViewById(R.id.tvMenuPrincipal);

        UsuarioAdapter adapter = new UsuarioAdapter(this, usuarios);
        listViewUsuarios.setAdapter(adapter);

        tvMenuPrincipal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intentMenuPrincipal = new Intent(ListaUsuario.this, MainActivity.class);
                startActivity(intentMenuPrincipal);
            }
        });

    }
}