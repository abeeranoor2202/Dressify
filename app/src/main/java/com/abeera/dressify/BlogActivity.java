package com.abeera.dressify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class BlogActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, new QuotesFragment())
                    .commit();
        }
    }

}
