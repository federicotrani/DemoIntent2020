package ar.com.dartech.demointent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaActivity extends AppCompatActivity {

    private Button btnSegundaTelefono, btnSegundaNavegador, btnSegundaCerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        // referencia controles de la VISTA
        this.findUI();
    }

    private void findUI(){
        btnSegundaTelefono = findViewById(R.id.btnSegundaTelefono);
        btnSegundaNavegador = findViewById(R.id.btnSegundaNavegador);
        btnSegundaCerrar = findViewById(R.id.btnSegundaCerrar);

        btnSegundaCerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnSegundaTelefono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // intent implicito marcado telefono
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:666666666"));
                startActivity(intent);
            }
        });

        btnSegundaNavegador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // intent implicito navegador web
                Uri webpage = Uri.parse("https://google.com");

                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }


}
