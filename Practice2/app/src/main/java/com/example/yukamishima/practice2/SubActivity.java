package com.example.yukamishima.practice2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class SubActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sub);

        Button nextButton = findViewById(R.id.next_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent type;
                type = getIntent();
                int text = type.getIntExtra("type1",0);
                int text2 = type.getIntExtra("type2",0);
                int text3 = type.getIntExtra("type3",0);
                int text4 = type.getIntExtra("type4",0);

                Intent intent = new Intent(getApplication(), SubActivity2.class);

                RadioGroup radioGroup = (RadioGroup)findViewById(R.id.group);
                int id = radioGroup.getCheckedRadioButtonId();
                RadioButton num = (RadioButton)findViewById(id);
                if(num == (RadioButton)findViewById(R.id.radioButton5)){
                    intent.putExtra("type1",(1 + text));
                    intent.putExtra("type2",text2);
                    intent.putExtra("type3",text3);
                    intent.putExtra("type4",text4);
                }else if(num == (RadioButton)findViewById(R.id.radioButton6)){
                    intent.putExtra("type1",text);
                    intent.putExtra("type2",(1 + text2));
                    intent.putExtra("type3",text3);
                    intent.putExtra("type4",text4);

                }else if(num == (RadioButton)findViewById(R.id.radioButton7)){
                    intent.putExtra("type1",text);
                    intent.putExtra("type2",text2);
                    intent.putExtra("type3",(1 + text3));
                    intent.putExtra("type4",text4);

                }else if(num == (RadioButton)findViewById(R.id.radioButton8)){
                    intent.putExtra("type1",text);
                    intent.putExtra("type2",text2);
                    intent.putExtra("type3",text3);
                    intent.putExtra("type4",(1 + text4));

                }else{
                    intent.putExtra("type1",text);
                    intent.putExtra("type2",text2);
                    intent.putExtra("type3",text3);
                    intent.putExtra("type4",text4);
                }
                startActivity(intent);
            }
        });

        Button returnButton = findViewById(R.id.return_button);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
