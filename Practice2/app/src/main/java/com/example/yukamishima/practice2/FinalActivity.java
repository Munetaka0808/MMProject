package com.example.yukamishima.practice2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

public class FinalActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Intent type;
        type = getIntent();
        int text1 = type.getIntExtra("type1",0);
        int text2 = type.getIntExtra("type2",0);
        int text3 = type.getIntExtra("type3",0);
        int text4 = type.getIntExtra("type4",0);

        int [] num = {text1, text2, text3, text4};
        int max = num[0];
        for(int i = 1; i < num.length; ++i){
            max = Math.max(max, num[i]);
        }

        if(max == text1){
            ImageView imageView1 = findViewById(R.id.image_view_1);
            imageView1.setImageResource(R.drawable.hertchoco);
            Toast toast = Toast.makeText(this, "草食系男子", Toast.LENGTH_LONG);
            toast.show();
        }else if(max == text2){
            ImageView imageView2 = findViewById(R.id.image_view_2);
            imageView2.setImageResource(R.drawable.thankyouchoco);
            Toast toast = Toast.makeText(this, "断食系男子", Toast.LENGTH_LONG);
            toast.show();
        }else if(max == text3){
            ImageView imageView3 = findViewById(R.id.image_view_3);
            imageView3.setImageResource(R.drawable.netachoco);
            Toast toast = Toast.makeText(this, "絶食系男子", Toast.LENGTH_LONG);
            toast.show();
        }else if(max == text4){
            ImageView imageView4 = findViewById(R.id.image_view_4);
            imageView4.setImageResource(R.drawable.favoritechoco);
            Toast toast = Toast.makeText(this, "雑食系男子", Toast.LENGTH_LONG);
            toast.show();
        }else{
            Toast toast = Toast.makeText(this, "該当なし", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
