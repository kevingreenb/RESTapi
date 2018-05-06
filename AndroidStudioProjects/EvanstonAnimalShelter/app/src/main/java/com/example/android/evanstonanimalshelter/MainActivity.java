package com.example.android.evanstonanimalshelter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView twitter, facebook, instagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        twitter = (ImageView) findViewById(R.id.twitter_image);
        facebook = (ImageView) findViewById(R.id.facebook_image);
        instagram = (ImageView) findViewById(R.id.instagram_image);

    } // End of the onCreate

    public void onClick(View view) {

        //Get url from tag
        String url = (String) view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse(url));

        startActivity(intent);
    }


}
