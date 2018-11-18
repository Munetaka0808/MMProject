package com.mmproject.mishimacollection;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

import com.mmproject.mishimacollection.fragment.DiagnosisFragment;
import com.mmproject.mishimacollection.fragment.DiagnosisFragmentPagerAdapter;

public class DiagnosisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);

        FragmentManager manager = getSupportFragmentManager();
        ViewPager viewPager = (ViewPager)findViewById(R.id.diagnosis_view_pager);
        DiagnosisFragmentPagerAdapter adapter = new DiagnosisFragmentPagerAdapter(manager);
        viewPager.setAdapter(adapter);
    }
}
