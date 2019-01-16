package com.example.david.touchinput;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class PictureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);

        Intent intent = getIntent();

        final int imageId = intent.getIntExtra(MainActivity.MESSAGE, 0);

        final ImageView animalView = findViewById(R.id.show_animal_view);

        animalView.setImageResource(imageId);

        animalView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getActionMasked();

                switch( action) {
                    case (MotionEvent.ACTION_UP) :
                        Log.d("MotionEvent", "UP");
                        animalView.setImageResource(imageId);
                        return true;
                    case (MotionEvent.ACTION_DOWN) :
                        Log.d("MotionEvent", "DOWN");
                        animalView.setImageResource(R.drawable.hamster);
                        return true;

                }

                return false;
            }
        });


    }

//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//
//        //Log.d("Touchevent", event.toString());
//
//        int action = event.getActionMasked();
//
//        switch(action) {
//            case (MotionEvent.ACTION_DOWN) :
//                Log.d("Touchevent", "DOWN");
//                return true;
//            case (MotionEvent.ACTION_UP) :
//                Log.d("Touchevent", "UP");
//                return true;
//            case (MotionEvent.ACTION_MOVE) :
//                Log.d("Touchevent", "MOVE");
//                return true;
//
//        }
//
//
//        return super.onTouchEvent(event);
//    }



}
