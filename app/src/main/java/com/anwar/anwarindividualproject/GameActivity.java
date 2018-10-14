package com.anwar.anwarindividualproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    GridView gridView;
    String animals[] = {"8","2","1","4","","6","7","5","3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        gridView = (GridView) findViewById(R.id.simpleGridView);
        CustomAdapter customAdapter = new CustomAdapter(this,animals);
        gridView.setAdapter(customAdapter);
    }
}
