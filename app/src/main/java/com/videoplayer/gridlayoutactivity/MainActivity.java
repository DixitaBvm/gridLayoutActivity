package com.videoplayer.gridlayoutactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  GridView gridView = (GridView) findViewById(R.id.grid_view);

        GridView gridView = (GridView) findViewById(R.id.grid_view);

        // Instance of ImageAdapter Class
        gridView.setAdapter(new ImageAdapter(this));

        Toast.makeText(this, "helloo", Toast.LENGTH_SHORT).show();

        Log.e("TAG", "onCreate: hello this gird demo" );
    }
}