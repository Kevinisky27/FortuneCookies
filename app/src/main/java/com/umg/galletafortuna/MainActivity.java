package com.umg.galletafortuna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnMensaje;
    TextView tvMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button
        btnMensaje = findViewById(R.id.fortuneCookie);
        tvMensaje = findViewById(R.id.tvMensaje);

        final String fortuna [] = {
            "Tendrás un día de alegrías y buenos momentos, disfrútalos como nunca.",
            "Concéntrate en lo que quieres lograr y ganaras. No lo olvides.",
            "El cielo sera tu limite, pues grandes acontecimientos te sucederán.",
            "Te sentirás feliz como un niño y veras al mundo con sus ojos.",
            "Vivirás tu vejez con comodidades y riquezas materiales.",
            "Confía en tu suerte, que es mucha y te rodeara de prosperidad.",
            "No todo el mundo puede recibir las mismas cosas. Se practico.",
            "Hoy es el momento de explorar: no temas.",
            "Muy pronto seras incluido en muchas reuniones, fiestas y tertulias.",
            "Cuando busques lo que mas deseas, recuerda hacer tu mejor esfuerzo.",
            "Tienes por delante un maravilloso día para triunfar; disfrútalo y compártelo.",
            "Hoy seras reconocido por tus dones especiales y lograras ser feliz por muchas horas.",
            "Tu corazón estallara de alegría con la llegada de buenas noticias.",
            "Mañana puede ser muy tarde para disfrutar lo que tienes hoy.",
            "Seras promovido en tu trabajo debido a tus logros y capacidades."
        };


        btnMensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int galleta = random.nextInt(15);

                tvMensaje.setText(fortuna[galleta]);

                Toast.makeText(getApplicationContext(), "Galleta Fabricada", Toast.LENGTH_LONG).show();
            }
        });
    }
}