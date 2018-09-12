package br.edu.faculdade.valordolar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editCotacao;
    EditText editDolar;
    EditText editResult;
    Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editCotacao = findViewById(R.id.editCotacao);
        editDolar = findViewById(R.id.editDolar);
        buttonCalcular = findViewById(R.id.buttonCalcular);
        editResult = findViewById(R.id.editResult);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Cotação
                double cotacao = Double.parseDouble(editCotacao.getText().toString());
                double dolar = Double.parseDouble(editDolar.getText().toString());
                double resultado = cotacao * dolar;
                editResult.setText(Double.toString(resultado));
            }
        });


    }
}
