package com.fabricio.chatfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText meditemail;
    private EditText meditpassword;
    private Button mbuttonEnter;
    private TextView mtxtaccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meditemail = findViewById(R.id.editEmail);
        meditpassword = findViewById(R.id.editPassword);
        mbuttonEnter = findViewById(R.id.btn_Enter);
        mtxtaccount = findViewById(R.id.txt_account);

        mbuttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //testar no logcat se esta aparecendo o email e senha quando digita
                String email = meditemail.getText().toString();
                String pass = meditpassword.getText().toString();
                Log.i("teste",email);
                Log.i("teste",pass);

            }
        });

        //ação quando clicar no texto, (criar conta) redireciona para tela
        mtxtaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });


    }






}