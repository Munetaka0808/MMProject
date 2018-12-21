package com.mmproject.mishimacollection;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mDescriptionDialogButton;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("MMProject");
        builder.setMessage("説明かくとこ");
        builder.setPositiveButton("閉じる", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        mDescriptionDialogButton = (Button)findViewById(R.id.description_dialog_button);
        mDescriptionDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.show();
            }
        });
        mStartButton = (Button)findViewById(R.id.start_button);
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DiagnosisActivity.class);
                startActivity(intent);
            }
        });
    }
}
