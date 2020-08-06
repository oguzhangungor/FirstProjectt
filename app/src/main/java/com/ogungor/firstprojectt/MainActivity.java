package com.ogungor.firstprojectt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnText(View view)
    {

        ImageView imageView= findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.cr72);
        Button button=findViewById(R.id.button);
        button.setText(getString(R.string.change_btn_text));
    }
}
