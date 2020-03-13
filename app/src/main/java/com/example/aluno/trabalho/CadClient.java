package com.example.aluno.trabalho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CadClient extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cad_client);
    }

    protect void valCPF(String cpf){

    }

    private void buscaCliente(int id){
        ControlCliente control = new ControlCliente();
        Cliente cli = control.buscaCluente(id);
    }
}
