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

        animalImage = findViewById(R.id.animal_image);

        animalImage.setImageResource(R.drawable.cat);



        //version 1
        // på våra knappar kan göra en automatisk koppling från vår layout till en specifik metod
        // när knappen trycks körs vår metod
        // nu vill vi i stället reagera på ett click på vår bild (ImageView) då måste vi lägga till
        // en click lystnare till vår ImageView
        // detta gör vi med hjälp av en * Anonym Klass * (anonymous class)
        // där vi overridar onClick metoden - den metoden kommer sedan att köras när vi clickar på vår bild

//        animalImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v)
//            {
//                if(animalImage != null) {
//                    //animalImage.setImageResource(0);
//                    animalImage.setImageDrawable(null);
//                }
//
//            }
//
//        });


    }

    // körs när katt-knappen trycks pga att vi angett det i vår xml-layout
    public void catButtonPressed(View view) {

        //version 2 - starta en ny aktivitet och visa bilden där
        // skicka med vilken bild som skall visas till den nya aktiviteten
        intent.putExtra(MESSAGE, R.drawable.cat);
        startActivity(intent);


        //version 1 - visa bild när vi trycker på knappen
        //       if(animalImage != null)
//        animalImage.setImageResource(R.drawable.cat);
    }

    // körs när hund-knappen trycks pga att vi angett det i vår xml-layout
    public void dogButtonPressed(View view) {

        //version 2 - starta en ny aktivitet och visa bilden där
        intent.putExtra(MESSAGE, R.drawable.dog);

        startActivity(intent);

        //version 1 - visa bild när vi trycker på knappen
//        if(animalImage != null)
//            animalImage.setImageResource(R.drawable.dog);
    }


}
