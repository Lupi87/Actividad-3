package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {


    private Button BtnPassword;
    private Button BtnAccount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnPassword = (Button) findViewById(R.id.text_btn_create_password);

        BtnPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar snackbar = Snackbar.make(BtnPassword,"Próximamente se implementará está función, disculpe las molestias",Snackbar.LENGTH_SHORT);
                snackbar.show();

            }
        });

        BtnAccount = (Button)  findViewById(R.id.text_btn_account);

        BtnAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar snackbar = Snackbar.make(BtnAccount,"Próximamente se implementará está función, disculpe las molestias",Snackbar.LENGTH_SHORT);
                snackbar.show();

            }
        });

    }

    }