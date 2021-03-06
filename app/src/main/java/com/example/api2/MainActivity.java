package com.example.api2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void act_generate( View view){
        Intent act_generate = new Intent(this, GenerateToken.class);
        startActivity(act_generate);
    }

    public void add_newtoken( View view){
        Intent add_newtoken = new Intent(this, AddNewTokenName.class);
        startActivity(add_newtoken);
    }
}