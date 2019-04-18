package com.LAT2_AKBIF9_10116378_SRIUTAMININGSIH;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }
    public void verify (View view ){
        Intent intent = new Intent(Activity3.this,Activity_4.class);
        startActivity(intent);
    }
}
