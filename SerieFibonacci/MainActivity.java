package com.paolavargas.miapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvFibonacci;
    private Button btnFibonacci;

    // Variables para mantener el estado de la serie Fibonacci
    private long fibPrev = 1;  // Primer número
    private long fibCurr = 1;  // Segundo número
    private int clickCount = 0; // Contador de clics

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFibonacci = findViewById(R.id.tvFibonacci);
        btnFibonacci = findViewById(R.id.btnFibonacci);

        btnFibonacci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateNextFibonacci();
            }
        });
    }

    // Calcula el siguiente número de Fibonacci y lo muestra en el TextView
    private void generateNextFibonacci() {
        clickCount++;
        if (clickCount == 1) {
            // Primer clic: muestra el primer número
            tvFibonacci.setText("1");
        } else if (clickCount == 2) {
            // Segundo clic: muestra el segundo número
            tvFibonacci.setText("1, 1");
        } else {
            // Para el tercer clic en adelante, se calcula el siguiente número
            long next = fibPrev + fibCurr;
            // Actualiza los valores para la próxima iteración
            fibPrev = fibCurr;
            fibCurr = next;
            // Se concatena el siguiente número al TextView
            String currentText = tvFibonacci.getText().toString();
            tvFibonacci.setText(currentText + ", " + next);
        }
    }
}




