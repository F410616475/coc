package com.example.coc;
import android.widget.EditText;
import android.widget.TextView;
import android.view.*;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class D extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);


        Button btn_D=findViewById(R.id.btn_D);
        btn_D.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent =  new Intent(D.this,C.class);
                startActivity(intent);
            }
        });
    }
}