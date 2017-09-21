package com.example.cisc.mesacollege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button buttonMesa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMesa = (Button) findViewById(R.id.buttonMesa);
        buttonMesa.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent y;
        y = new Intent(this, MesaCollegeActivity.class);
        startActivity(y);

    }
}



//To implement interface methods, that are missing,
//Generate -> Implements Methods..