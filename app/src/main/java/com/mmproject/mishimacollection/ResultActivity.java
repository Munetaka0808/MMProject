package com.mmproject.mishimacollection;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.mmproject.mishimacollection.fragment.DiagnosisFragment;

public class ResultActivity extends AppCompatActivity {

    private static final String NO_SELECTED = "no selected";

    private TextView mPage1ResultText;
    private TextView mPage2ResultText;
    private TextView mPage3ResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mPage1ResultText = (TextView) findViewById(R.id.page1_result);
        mPage2ResultText = (TextView) findViewById(R.id.page2_result);
        mPage3ResultText = (TextView) findViewById(R.id.page3_result);

        SharedPreferences data = getSharedPreferences(DiagnosisFragment.SELECTED_RESULT, Context.MODE_PRIVATE);
        String page1String = data.getString("page1", NO_SELECTED);
        String page2String = data.getString("page2", NO_SELECTED);
        String page3String = data.getString("page3", NO_SELECTED);

        mPage1ResultText.setText(page1String);
        mPage2ResultText.setText(page2String);
        mPage3ResultText.setText(page3String);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        SharedPreferences data = getSharedPreferences(DiagnosisFragment.SELECTED_RESULT, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = data.edit();
        editor.clear().apply();
    }
}
