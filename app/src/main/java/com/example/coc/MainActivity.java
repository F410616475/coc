package com.example.coc;
import android.view.*;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_A=findViewById(R.id.btn_A);
        btn_A.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view){
                     Intent intent =  new Intent(MainActivity.this,B.class);
                     startActivity(intent);
            }
            });
    }
}