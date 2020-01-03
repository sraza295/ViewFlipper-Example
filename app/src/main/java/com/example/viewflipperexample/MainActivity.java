package com.example.viewflipperexample;

import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.viewflipperexample.modal.BannerSectionList;
import com.example.viewflipperexample.modal.MovieList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int[] imageList = {R.drawable.guava, R.drawable.jackfruit, R.drawable.mix_fruit,
            R.drawable.pomegranate, R.drawable.strawberry, R.drawable.zespri_kiwi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            ViewFlipper viewFlipper = findViewById(R.id.flipper);
            viewFlipper.setFlipInterval(2000);
            viewFlipper.setAutoStart(true);

            viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
            viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);

            String response = readJSONFromAsset();
            System.out.println(response);

            GsonBuilder gsonBuilder = new GsonBuilder();
            Gson gson = gsonBuilder.create();
            MovieList movieList = gson.fromJson(response, MovieList.class);
            List<BannerSectionList> bannerSectionList = movieList.getBannerSectionList();

            for(int i=0;i<bannerSectionList.size();i++)
            {
                ImageView imageView = new ImageView(this);
                FrameLayout.LayoutParams params =
                        new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                params.setMargins(30, 30, 30, 30);
                params.gravity = Gravity.CENTER;
                imageView.setLayoutParams(params);
                Picasso.with(imageView.getContext()).load(bannerSectionList.get(i).getImagePath()).into(imageView);
                viewFlipper.addView(imageView);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

       /* for (int image : imageList) {
            ImageView imageView = new ImageView(this);
            FrameLayout.LayoutParams params =
                    new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params.setMargins(30, 30, 30, 30);
            params.gravity = Gravity.CENTER;
            imageView.setLayoutParams(params);
            imageView.setImageResource(image);
            viewFlipper.addView(imageView);
        }*/

    }

    public String readJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getAssets().open("db.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
