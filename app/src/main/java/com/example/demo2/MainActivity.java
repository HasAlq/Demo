package com.example.demo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button submitButton;
    private EditText name;
    private String strName;
    private String strPassword;
    private EditText pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitButton = findViewById(R.id.btnSubmit);
        name = findViewById(R.id.name);
        pw   = findViewById(R.id.pw);
        Log.d("H", "H");
        submitButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                strName = name.getText().toString().trim();
                strPassword = pw.getText().toString().trim();

                if (!strName.isEmpty() && !strPassword.isEmpty()) {
                    Intent intent = new Intent(MainActivity.this, HelloPage.class);
                    startActivity(intent);
                }
            }
        });
    }
}
