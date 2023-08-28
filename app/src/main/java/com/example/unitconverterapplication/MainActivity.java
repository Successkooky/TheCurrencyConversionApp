package com.example.unitconverterapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText idEdtRupees;
    TextView idTVIntro,idTVConversions;
    Button idBtnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idEdtRupees=findViewById(R.id.idEdtRupees);
        idTVIntro=findViewById(R.id.idTVIntro);
        idTVConversions=findViewById(R.id.idTVConversions);
        idBtnConvert=findViewById(R.id.idBtnConvert);

        idBtnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String input=idEdtRupees.getText().toString();
                // Conversion of String to Double
                double rupees=Double.parseDouble(input);
                double dollars=Convert(rupees);
                idTVConversions.setText(""+dollars);

            }
        });
    }
    public double Convert(double rupees){
        return rupees * 82.67;
    }
}