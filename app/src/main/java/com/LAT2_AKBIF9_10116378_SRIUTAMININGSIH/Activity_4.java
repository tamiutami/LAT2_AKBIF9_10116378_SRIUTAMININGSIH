package com.LAT2_AKBIF9_10116378_SRIUTAMININGSIH;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }
    public void utama (View view){
        Intent intent = new Intent(Activity_4.this,Activity5.class);
        startActivity(intent);
    }
}
