package com.example.agregar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
public class nombres extends AppCompatActivity {
    ListView lv1;
    private EditText texto,texto2;
    private ArrayList<String> datos;
    private ArrayAdapter<String> adp;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombres);

        datos=new ArrayList<String>();
        texto=(EditText)findViewById(R.id.nombre);
        texto2=(EditText)findViewById(R.id.apellido);
        adp=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,datos);
        lv1=(ListView)findViewById(R.id.lista);
        lv1.setAdapter(adp);

    lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override

        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            final int posicion=position;
            AlertDialog.Builder dialogo1 = new AlertDialog.Builder(nombres.this);
            dialogo1.setTitle("Importante");
            dialogo1.setMessage("¿  Desea eliminar este usuario ?");
            dialogo1.setCancelable(false);
            dialogo1.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {
                    datos.remove(posicion);
                    adp.notifyDataSetChanged();
                }
            });
            dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {
                }
            });
            dialogo1.show();


        }
    });



    }


    public void agregar(View v) {
        datos.add(texto.getText().toString()+" "+texto2.getText().toString());
        adp.notifyDataSetChanged();
        texto.setText("");
        texto2.setText("");
    }
}
