package com.example.lab3;



import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {


    private EditText champNom, champEmail, champTel, champAdresse, champVille;
    private Button btnSuivant;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        champNom     = findViewById(R.id.champNom);
        champEmail   = findViewById(R.id.champEmail);
        champTel     = findViewById(R.id.champTel);
        champAdresse = findViewById(R.id.champAdresse);
        champVille   = findViewById(R.id.champVille);
        btnSuivant   = findViewById(R.id.btnSuivant);


        btnSuivant.setOnClickListener(v -> {


            String sNom     = champNom.getText().toString().trim();
            String sEmail   = champEmail.getText().toString().trim();
            String sTel     = champTel.getText().toString().trim();
            String sAdresse = champAdresse.getText().toString().trim();
            String sVille   = champVille.getText().toString().trim();


            if (sNom.isEmpty() || sEmail.isEmpty()) {
                Toast.makeText(this, "Veuillez remplir le nom et l'email.", Toast.LENGTH_SHORT).show();
                return;
            }



            Intent i = new Intent(MainActivity.this, Screen2Activity.class);
            i.putExtra("nom", sNom);
            i.putExtra("email", sEmail);
            i.putExtra("tel", sTel);
            i.putExtra("adresse", sAdresse);
            i.putExtra("ville", sVille);
            startActivity(i);
        });
    }
}