package com.ogungor.firstprojectt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int mImageNumber = -1;
    ImageView mImageView;
    ArrayList<Integer> mimageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = findViewById(R.id.imageView);
        mimageList.add(R.drawable.cr71);
        mimageList.add(R.drawable.cr72);
        mimageList.add(R.drawable.cr73);

        //Commit line by ismailgungor
    }

    public Integer getImage(int placeNumber, ArrayList<Integer> imageList) {
        return imageList.get(placeNumber);
    }

    public void btnNext(View view) {

        if (mImageNumber == 2)
            Toast.makeText(this, "Son Resim.", Toast.LENGTH_LONG).show();
        else {
            mImageNumber++;
            mImageView.setImageResource(getImage(mImageNumber, mimageList));
        }
    }

    public void btnBack(View view) {
        if (mImageNumber == 0)
            Toast.makeText(this, "Son Resim.", Toast.LENGTH_LONG).show();
        else {
            mImageNumber--;
            mImageView.setImageResource(getImage(mImageNumber, mimageList));
        }
    }

}
