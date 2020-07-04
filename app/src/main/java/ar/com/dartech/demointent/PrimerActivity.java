package ar.com.dartech.demointent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PrimerActivity extends AppCompatActivity {

    private Button btnPrimerActivityCerrar;
    private TextView txtNombreEmpleado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primer);

        // recuperar parametros
        Intent pantallaOrigen = getIntent();
        Bundle extras = pantallaOrigen.getExtras();

        String nombre_persona = extras.getString("EXTRA_EMPLEADO");
        int edad_persona = extras.getInt("EXTRA_EDAD");

        // textview
        txtNombreEmpleado = findViewById(R.id.txtNombreEmpleado);
        txtNombreEmpleado.setText("Bienvenido " + nombre_persona);
        // botones
        btnPrimerActivityCerrar = findViewById(R.id.btnPrimerActivityCerrar);
        btnPrimerActivityCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // llamar con INTENT a otra ACTIVITY
                finish();
            }
        });
    }
}
