package com.example.agregar;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.*;
import android.widget.*;
import android.content.*;

import android.app.*;

import android.app.DialogFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



final EditText texto;
final Button boton;
final EditText texto2;
texto2=(EditText)findViewById(R.id.texto2);
texto=(EditText)findViewById(R.id.texto);
boton=(Button)findViewById(R.id.boton);
boton.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent (v.getContext(), nombres.class);
    String id=texto.getText().toString();
    String pw=texto2.getText().toString();
    if(id.equalsIgnoreCase("usuario")&& pw.equalsIgnoreCase("contraseña")){

        startActivityForResult(intent ,0);
    }




    }
});






    }

}
