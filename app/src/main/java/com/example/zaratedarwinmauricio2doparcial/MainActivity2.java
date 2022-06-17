package com.example.zaratedarwinmauricio2doparcial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    EditText edtNom,edtCelu, edtFe,etHora;
    Button btnRese;
    RecyclerView rvLista;
    ArrayList<Cita> listaCitas;
    Cita cita;
    Adaptador adaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        edtNom = findViewById(R.id.edtNombreMascota);
        edtCelu = findViewById(R.id.edtNumeroCelular);
        edtFe = findViewById(R.id.edtFecha);
        etHora = findViewById(R.id.edtHora);
        btnRese = findViewById(R.id.btnReser);
        rvLista = findViewById(R.id.rvLista);
        listaCitas = new ArrayList<Cita>();
        adaptador = new Adaptador(listaCitas);
        rvLista.setLayoutManager(new GridLayoutManager(this,1));
        rvLista.setAdapter(adaptador);
        btnRese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String stringNombre = edtNom.getText().toString().trim();
                    String stringCelular = edtCelu.getText().toString().trim();
                    String stringFecha = edtFe.getText().toString().trim();
                    String stringHora = etHora.getText().toString().trim();

                    if (stringNombre.equals("")){
                        edtNom.setError("debe registrar el nombre");
                        edtNom.requestFocus();
                        return;
                    }if (stringCelular.equals("")){
                        edtCelu.setError("debe registrar el precio");
                        edtCelu.requestFocus();
                        return;
                    }if (stringFecha.equals("")){
                        edtFe.setError("debe registrar la serie");
                        edtFe.requestFocus();
                        return;
                    }if (stringHora.equals("")){
                        etHora.setError("debe registrar el codigo del producto");
                        etHora.requestFocus();
                        return;
                    }
                    cita= new Cita(stringNombre,stringCelular,stringFecha,stringHora);
                    listaCitas.add(cita);
                    rvLista.setAdapter(adaptador);
                    limpiarFormulario();
                }
                catch (Exception ex){

                }
            }
            private void limpiarFormulario() {
                edtNom.setText("");
                edtCelu.setText("");
                edtFe.setText((""));
                etHora.setText((""));
            }
        });
    }
}
