package com.example.yukamishima.practice2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private String text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Button sendButton = findViewById(R.id.send_button);
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplication(), SubActivity.class);

                RadioGroup radioGroup = (RadioGroup)findViewById(R.id.group);
                int id = radioGroup.getCheckedRadioButtonId();
                RadioButton num = (RadioButton)findViewById(id);
                if(num == (RadioButton)findViewById(R.id.radioButton)){
                    intent.putExtra("type1",1);
                    intent.putExtra("type2",0);
                    intent.putExtra("type3",0);
                    intent.putExtra("type4",0);

                }else if(num == (RadioButton)findViewById(R.id.radioButton2)){
                    intent.putExtra("type1",0);
                    intent.putExtra("type2",1);
                    intent.putExtra("type3",0);
                    intent.putExtra("type4",0);
                }else if(num == (RadioButton)findViewById(R.id.radioButton3)){
                    intent.putExtra("type1",0);
                    intent.putExtra("type2",0);
                    intent.putExtra("type3",1);
                    intent.putExtra("type4",0);
                }else if(num == (RadioButton)findViewById(R.id.radioButton4)){
                    intent.putExtra("type1",0);
                    intent.putExtra("type2",0);
                    intent.putExtra("type3",0);
                    intent.putExtra("type4",1);
                }else{
                    intent.putExtra("type1",0);
                    intent.putExtra("type2",0);
                    intent.putExtra("type3",0);
                    intent.putExtra("type4",0);
                }
                startActivity(intent);


            }
        }) ;
    }
}
