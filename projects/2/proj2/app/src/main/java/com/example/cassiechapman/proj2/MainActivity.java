package com.example.cassiechapman.proj2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* This is the code for the Art Inspiration app. The app:
            - displays a drop-down list of art subject, techniques, and mediums
            - User selects n options from the lists
            - Once selected, the user click "Inspire Me" button
            - Button launches a random generator
            - The app then displays n terms or phrases within the selected lists

           For example,
             * user drops down the list and selects MEDIUM & ANIMAL
             * User clicks INSPIRE ME
             * App displays "Watercolor Rabbit"
             * If user clicks INSPIRE ME again, app displays "Fingerpaint Dolphin"

           Stage 2:
             - user create an "account" of name, username, password, & details
             - save favorite ideas
         */

        System.out.println("Try this:");
        


    }
}
