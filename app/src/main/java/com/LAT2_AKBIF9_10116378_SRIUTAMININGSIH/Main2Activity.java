package com.LAT2_AKBIF9_10116378_SRIUTAMININGSIH;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void almostthere(View view) {
        Intent intent = new Intent(Main2Activity.this, Activity3.class);
        startActivity(intent);
    }
}
