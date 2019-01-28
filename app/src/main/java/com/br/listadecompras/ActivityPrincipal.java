package com.br.listadecompras;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.br.listadecompras.util.AlertasUtil;

public class ActivityPrincipal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_principal);
    }

    public void abrirCriarLista(View view){
        Intent criarListaIntent = new Intent(this, CriaListaActivity.class);
        startActivity(criarListaIntent);
        AlertasUtil.toastCurto(this, "Adicionar lista");
    }

    public void abrirMinhasListas(View view){
        Intent minhasListasIntent = new Intent(this, MinhasListasActivity.class);
        startActivity(minhasListasIntent);
        AlertasUtil.toastCurto(this, "Minhas listas");
    }

    public void abrirCadastrarProduto(View view){
        Intent cadastrarProdutoIntent = new Intent(this, CadastrarProdutoActivity.class);
        startActivity(cadastrarProdutoIntent);
        AlertasUtil.toastCurto(this, "Cadastrar produto.");
    }
}
