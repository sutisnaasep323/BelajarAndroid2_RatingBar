package com.example.basicandroid3_ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    Button cd_view;
    TextView tv_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.rating);
        cd_view = findViewById(R.id.cd_view);
        tv_view = findViewById(R.id.text3);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                ratingBar.getRating();
            }
        });

        cd_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_view.setText("Hasil rating yang anda berikan : " + ratingBar.getRating());
            }
        });
    }
}