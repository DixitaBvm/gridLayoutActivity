package com.videoplayer.gridlayoutactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class full_image_Activity extends AppCompatActivity {

    public Integer[] mThumbIds = {
            R.drawable.img, R.drawable.img_1,
            R.drawable.img_2, R.drawable.img_3,
            R.drawable.img_4, R.drawable.img_5,
            R.drawable.img_6, R.drawable.img,
            R.drawable.img_1, R.drawable.img_2,
            R.drawable.img_3, R.drawable.img_4,
            R.drawable.img_5, R.drawable.img_6,
            R.drawable.img
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_image);

        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(full_image_Activity.this);

        ImageView imageView = (ImageView) findViewById(R.id.full_image_view);
        imageView.setImageResource(imageAdapter.mThumbIds[position]);
    }
}