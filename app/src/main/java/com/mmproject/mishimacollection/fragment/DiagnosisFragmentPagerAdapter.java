package com.mmproject.mishimacollection.fragment;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.mmproject.mishimacollection.R;

public class DiagnosisFragmentPagerAdapter extends FragmentPagerAdapter {
    public DiagnosisFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return DiagnosisFragment.newInstance(android.R.color.holo_blue_bright, R.string.diagnosis_question1);
            case 1:
                return DiagnosisFragment.newInstance(android.R.color.holo_green_light, R.string.diagnosis_question2);
            case 2:
                return DiagnosisFragment.newInstance(android.R.color.holo_red_dark, R.string.diagnosis_question3);
        }

        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "PAGE" + (position + 1);
    }
}
