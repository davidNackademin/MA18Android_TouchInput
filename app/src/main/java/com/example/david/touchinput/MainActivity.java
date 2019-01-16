package com.example.david.touchinput;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static final String MESSAGE = "imageID";

    ImageView animalImage;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(this, PictureActivity.class);

       // Button button = findViewById(R.id.cat_button);
        animalImage = findViewById(R.id.animal_image);

        animalImage.setImageResource(R.drawable.cat);


        animalImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(animalImage != null) {
                    //animalImage.setImageResource(0);
                    animalImage.setImageDrawable(null);
                }

            }

        });


    }

    public void catButtonPressed(View view) {


        intent.putExtra(MESSAGE, R.drawable.cat);

        startActivity(intent);
//       if(animalImage != null)
//        animalImage.setImageResource(R.drawable.cat);
    }

    public void dogButtonPressed(View view) {

        intent.putExtra(MESSAGE, R.drawable.dog);

        startActivity(intent);
//        if(animalImage != null)
//            animalImage.setImageResource(R.drawable.dog);
    }


}
