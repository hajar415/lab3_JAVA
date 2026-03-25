package com.example.lab3;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class Screen2Activity extends AppCompatActivity {



    private TextView zoneRecap;
    private Button btnRevenir;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);


        zoneRecap  = findViewById(R.id.zoneRecap);
        btnRevenir = findViewById(R.id.btnRevenir);


        Intent intent = getIntent();


        String nomRecu     = intent.getStringExtra("nom");
        String emailRecu   = intent.getStringExtra("email");
        String telRecu     = intent.getStringExtra("tel");
        String adresseRecu = intent.getStringExtra("adresse");
        String villeRecu   = intent.getStringExtra("ville");


        String resume = "Nom : "      + verifier(nomRecu) +
                "\nEmail : "  + verifier(emailRecu) +
                "\nTél : "    + verifier(telRecu) +
                "\nAdresse : "+ verifier(adresseRecu) +
                "\nVille : "  + verifier(villeRecu);


        zoneRecap.setText(resume);
        btnRevenir.setOnClickListener(v -> finish());
    }


    
    private String verifier(String s) {
        return (s == null || s.trim().isEmpty()) ? "—" : s.trim();
    }
}