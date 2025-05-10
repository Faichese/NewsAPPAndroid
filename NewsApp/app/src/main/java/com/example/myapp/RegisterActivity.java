package com.example.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class RegisterActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText nameInput = findViewById(R.id.input_name);
        EditText emailInput = findViewById(R.id.input_email);
        Button registerButton = findViewById(R.id.btn_register);

        registerButton.setOnClickListener(v -> {
            String name = nameInput.getText().toString();
            String email = emailInput.getText().toString();

            Log.d("REGISTER", "Nama: " + name + ", Email: " + email);
            Toast.makeText(this, "Register sukses untuk " + name, Toast.LENGTH_SHORT).show();
        });
    }
}