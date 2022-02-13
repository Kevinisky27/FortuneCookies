package com.umg.galletafortuna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random = new Random();

    Button btnMensaje;
    TextView tvMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button
        btnMensaje = findViewById(R.id.fortuneCookie);
        tvMensaje = findViewById(R.id.tvMensaje);


        btnMensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MensajesMotivadores mensaje = new MensajesMotivadores();

                int galleta = random.nextInt(15);
                tvMensaje.setText(mensaje.fortuna[galleta]);

                Toast.makeText(getApplicationContext(), "Galleta Fabricada", Toast.LENGTH_LONG).show();
            }
        });
    }
}