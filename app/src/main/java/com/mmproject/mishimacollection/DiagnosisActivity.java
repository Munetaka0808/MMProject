package com.mmproject.mishimacollection;

<<<<<<< HEAD
=======
import android.content.Intent;
>>>>>>> 674567f656b419131282b5476a74dd82e81888f2
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
<<<<<<< HEAD
=======
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
>>>>>>> 674567f656b419131282b5476a74dd82e81888f2

import com.mmproject.mishimacollection.fragment.DiagnosisFragmentPagerAdapter;

import static android.support.v4.view.ViewPager.SCROLL_STATE_DRAGGING;
import static android.support.v4.view.ViewPager.SCROLL_STATE_IDLE;
import static android.support.v4.view.ViewPager.SCROLL_STATE_SETTLING;

public class DiagnosisActivity extends AppCompatActivity {

<<<<<<< HEAD
    private TabLayout mTabLayout;
=======
    private static final String SELECTED_RESULT = "selected_result";

    private static ViewPager mViewPager;
    private TabLayout mTabLayout;
    private Button mDecideButton;
    private RadioGroup mRadioGroup;
    private DiagnosisFragment mFragment;
    private int mCurrentPage = 0;

    private DiagnosisFragmentPagerAdapter mAdapter;
>>>>>>> 674567f656b419131282b5476a74dd82e81888f2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);

        FragmentManager manager = getSupportFragmentManager();
<<<<<<< HEAD
        ViewPager viewPager = (ViewPager)findViewById(R.id.diagnosis_view_pager);
        DiagnosisFragmentPagerAdapter adapter = new DiagnosisFragmentPagerAdapter(manager);
        viewPager.setAdapter(adapter);
        mTabLayout = (TabLayout) findViewById(R.id.tableLayout);
        mTabLayout.setupWithViewPager(viewPager);
=======
        mViewPager = (ViewPager)findViewById(R.id.diagnosis_view_pager);
        final DiagnosisFragmentPagerAdapter adapter = new DiagnosisFragmentPagerAdapter(manager);
        mViewPager.setAdapter(adapter);

        mTabLayout = (TabLayout) findViewById(R.id.tableLayout);
        mTabLayout.setupWithViewPager(mViewPager);

        mDecideButton = (Button) findViewById(R.id.decide_button);
        mDecideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DiagnosisActivity.this, ResultActivity.class);
                startActivity(intent);
            }
        });

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                Log.d("takashi", "in onPageScrolled");
            }

            @Override
            public void onPageSelected(int position) {
                Log.d("takashi", "in onPageSelected");

            }

            @Override
            public void onPageScrollStateChanged(int state) {
                switch (state) {
                    case SCROLL_STATE_IDLE:
                        Log.d("takashi", "in SCROLL_STATE_IDLE");
                        break;
                    case SCROLL_STATE_DRAGGING:
                        Log.d("takashi", "in SCROLL_STATE_DRAGGING");

                        break;
                    case SCROLL_STATE_SETTLING:
                        Log.d("takashi", "in SCROLL_STATE_SETTLING");
                        break;
                }
            }
        });
    }

    public static int getCurrentPage() {
        return mViewPager.getCurrentItem();
>>>>>>> 674567f656b419131282b5476a74dd82e81888f2
    }
}
