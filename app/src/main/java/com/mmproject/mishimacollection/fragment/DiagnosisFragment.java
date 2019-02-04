package com.mmproject.mishimacollection.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.mmproject.mishimacollection.DiagnosisActivity;
import com.mmproject.mishimacollection.R;

public class DiagnosisFragment extends Fragment {

    private final static String BACKGROUND_COLOR = "background_color";
    private final static String QUESTION_TEXT = "question_text";

    public static final String SELECTED_RESULT = "selected_result";

    private RadioGroup mRadioGroup;
    private int mCurrentPage;

    public static DiagnosisFragment newInstance(@ColorRes int IdRes, int IdText) {
        DiagnosisFragment fragment = new DiagnosisFragment();
        Bundle b = new Bundle();
        b.putInt(BACKGROUND_COLOR, IdRes);
        b.putInt(QUESTION_TEXT, IdText);
        fragment.setArguments(b);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_diagnosis, null);
        ConstraintLayout constraintLayout = (ConstraintLayout)view.findViewById(R.id.fragment_diagnosis_constraintlayout);
        TextView diagnosisQuestionText = (TextView)view.findViewById(R.id.diagnosis_question_text);
        constraintLayout.setBackgroundResource(getArguments().getInt(BACKGROUND_COLOR));
        diagnosisQuestionText.setText(getArguments().getInt(QUESTION_TEXT));

        mRadioGroup = (RadioGroup) constraintLayout.findViewById(R.id.radio_group);
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Log.d("takashi", "onCheckedChanged");
                if (checkedId != -1) {
                    mCurrentPage = DiagnosisActivity.getCurrentPage();
                    RadioButton checkedRadioButton = (RadioButton) group.findViewById(checkedId);

                    SharedPreferences data = getActivity().getSharedPreferences(SELECTED_RESULT, Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = data.edit();
                    editor.putString("page" + (mCurrentPage + 1), checkedRadioButton.getText().toString());
                    editor.apply();

                    Toast.makeText(getContext(), "page:" + (mCurrentPage + 1) + ", " + checkedRadioButton.getText().toString(), Toast.LENGTH_LONG).show();
                }
            }
        });

        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    public int getCheckedRadioButtonId() {
        return mRadioGroup.getCheckedRadioButtonId();
    }
}
