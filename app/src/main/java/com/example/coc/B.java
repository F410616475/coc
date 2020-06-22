package com.example.coc;
import android.app.Activity;
import android.widget.EditText;
import android.widget.TextView;
import android.view.*;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class B extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);





        Button btn_B=findViewById(R.id.btn_B);
        btn_B.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent =  new Intent(B.this,C.class);
                startActivity(intent);
            }
        });
    }
}
