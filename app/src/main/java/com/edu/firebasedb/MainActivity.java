package com.edu.firebasedb;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database;
    DatabaseReference HumedadRef, presionRef, VelocidadRef, TemperaturaRef;
    EditText txt_temperatura_edit, txt_humedad_edit, txt_presion_edit, txt_velocidad_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = FirebaseDatabase.getInstance();

        HumedadRef = database.getReference("sensores/humedad");
        presionRef = database.getReference("sensores/presion");
        VelocidadRef = database.getReference("sensores/velocidad");
        TemperaturaRef = database.getReference("sensores/temperatura");

        txt_temperatura_edit = findViewById(R.id.setvalor_Temperatura);
        txt_humedad_edit = findViewById(R.id.setvalor_Humedad);
        txt_presion_edit = findViewById(R.id.setvalor_Presion);
        txt_velocidad_edit = findViewById(R.id.setvalor_Velocidad);

        TextView txtTemp = findViewById(R.id.valor_Temperatura);
        TextView txtHum = findViewById(R.id.valor_Humedad);
        TextView txtPres = findViewById(R.id.valor_Presion);
        TextView txtVel = findViewById(R.id.valor_Velocidad);

        TemperaturaRef.addValueEventListener(setListener(txtTemp, "°C"));
        HumedadRef.addValueEventListener(setListener(txtHum, "%"));
        presionRef.addValueEventListener(setListener(txtPres, "hPa"));
        VelocidadRef.addValueEventListener(setListener(txtVel, "km/h"));
    }

    public ValueEventListener setListener(TextView txt, String UnidadMedida) {
        return (new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists() && snapshot.getValue() != null) {
                    txt.setText(snapshot.getValue().toString() + " " + UnidadMedida);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                txt.setText("");
            }
        });
    }

    public void clickBotonTemperatura(View view) {
        TemperaturaRef.setValue(txt_temperatura_edit.getText().toString());
    }

    public void clickBotonHumedad(View view) {
        HumedadRef.setValue(txt_humedad_edit.getText().toString());
    }

    public void clickBotonPresion(View view) {
        presionRef.setValue(txt_presion_edit.getText().toString());
    }

    public void clickBotonVelocidad(View view) {
        VelocidadRef.setValue(txt_velocidad_edit.getText().toString());
    }

}
