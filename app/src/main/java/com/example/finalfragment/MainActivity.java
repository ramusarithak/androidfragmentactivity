package com.example.finalfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final firstfragment firstfragment = new firstfragment();
        final secondfragment secondfragment = new secondfragment();
        final FragmentTransaction ft = getSupportFragmentManager().beginTransaction();


        ft.add(R.id.framelayout,firstfragment).commit();
        final Button btn1=(Button)findViewById(R.id.button);
        Button btn2=(Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final FragmentTransaction ft2 = getSupportFragmentManager().beginTransaction();
                ft2.replace(R.id.framelayout,secondfragment).commit();
            }
        });
        Button bt=(Button)findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final FragmentTransaction fm1=getSupportFragmentManager().beginTransaction();
                fm1.replace(R.id.framelayout,firstfragment).commit();
            }
        });
    }

}
