package ar.com.dartech.demointent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnPrimerActivity, btnSegundaActivity;
    private EditText edtMainNombrePersona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPrimerActivity = findViewById(R.id.btnPrimeraActivity);
        btnSegundaActivity = findViewById(R.id.btnSegundaActivity);
        edtMainNombrePersona = findViewById(R.id.edtPrueba23);

        btnSegundaActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                startActivity(intent);
            }
        });

        btnPrimerActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = edtMainNombrePersona.getText().toString();

                Intent pantalla = new Intent(MainActivity.this, PrimerActivity.class);
                pantalla.putExtra("EXTRA_EMPLEADO", nombre);
                pantalla.putExtra("EXTRA_EDAD", 33);
                startActivity(pantalla);
            }
        });


    }
}
