package com.mmproject.mishimacollection.fragment;

import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mmproject.mishimacollection.R;

public class DiagnosisFragment extends Fragment {

    private final static String BACKGROUND_COLOR = "background_color";
    private final static String QUESTION_TEXT = "question_text";

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

        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
