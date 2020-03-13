package com.example.aluno.trabalho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private boolean login;
    private boolean senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public boolean VerificarLogin(boolean verifica){
        if(login==true && senha==true){
            verifica=true;
        }else{
            verifica=false;
        }

        return verifica;
    }


}
