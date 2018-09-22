package com.example.tahar.imc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtPoids, txtTaille;
    TextView textResultat;
    Button bimc;

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           // Toast.makeText(MainActivity.this, "click", Toast.LENGTH_LONG).show();

            Double taille = Double.parseDouble(txtTaille.getText().toString());

            Double poids = Double.parseDouble(txtPoids.getText().toString());

        Double imc = poids/ (taille*taille);
        textResultat.setText(String.valueOf(imc));
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPoids = (EditText) findViewById(R.id.editTextPoids);
        txtTaille = (EditText) findViewById(R.id.editTextTaille);
        textResultat = (TextView)findViewById(R.id.textViewResultat);

        bimc = (Button)findViewById(R.id.ButtonImc);
    bimc.setOnClickListener(listener);
    }

public void resetClick(View view)
{
    txtTaille.setText("");
    txtPoids.setText("");
    textResultat.setText("");
}


}
