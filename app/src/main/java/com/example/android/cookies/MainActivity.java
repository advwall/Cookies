package com.example.android.cookies;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */

    public void eatCookie(View view) {
        ImageView eatenCookieView = findViewById(R.id.android_cookie_image_view);
        eatenCookieView.setImageResource(R.drawable.after_cookie);

        TextView soFullView = findViewById(R.id.status_text_view);
        soFullView.setText("I'm so full");

        Button cookieButton = findViewById(R.id.eatCookie);
        cookieButton.setText("Bake more cookies");

    }

}
