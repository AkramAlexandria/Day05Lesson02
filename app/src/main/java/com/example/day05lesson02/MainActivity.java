package com.example.day05lesson02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCToast, btnOToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCToast = findViewById(R.id.btnCToast);
        btnOToast = findViewById(R.id.btnOToast);

        btnCToast.setOnClickListener(this);
        btnOToast.setOnClickListener(this);

        Toast toast=Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT);
        toast.setMargin(50,50);
        toast.show();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnCToast:
                startActivity(new Intent(this, CustomToast.class));
                break;

            case R.id.btnOToast:
                Toast.makeText(getApplicationContext(),"Hello Orignal Toast",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
