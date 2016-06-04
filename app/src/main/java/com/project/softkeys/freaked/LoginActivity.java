package com.project.softkeys.freaked;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.junio.freaked.R;

public class LoginActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText user,password;
    private Button btnSignIn;
    private TextView sign;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        toolbar=(Toolbar) findViewById(R.id.toolbar_login);
        toolbar.setTitle("Freaked");
        toolbar.setNavigationIcon(R.drawable.ic_account_balance_wallet_white_24dp ) ;


        setSupportActionBar(toolbar);

        user=(EditText) findViewById(R.id.user);
        password=(EditText) findViewById(R.id.password);

        btnSignIn=(Button) findViewById(R.id.sign_in);
        sign=(TextView) findViewById(R.id.sign);

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog=new AlertDialog.Builder(LoginActivity.this);
                dialog.setTitle("Vamos começar")
                        .setMessage("Como Freaked você pode efetuar vendas,trocas e doações a vontade." +
                                "Você também pode efetuar o cadastro de sua instituição para receber doações de freakeds." +
                                "Selecione seu Perfil:")
                        .setPositiveButton("Freaked", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(LoginActivity.this, "Vamos iniciar seu cadastro", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("Instituição", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(LoginActivity.this, "Vamos iniciar seu cadastro", Toast.LENGTH_SHORT).show();
                            }
                        });


                dialog.create().show();
            }
        });

    }

}
