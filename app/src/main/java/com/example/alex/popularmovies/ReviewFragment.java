package com.example.alex.popularmovies;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ReviewFragment extends Fragment {

    public static final String ARG_TEXT_KEY = "text";
    public static final String ARG_POSITION_KEY = "position";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Bundle args = getArguments();
        TextView textView = (TextView) inflater.inflate(R.layout.fragment_review, container, false);
        textView.setText(args.getString(ARG_TEXT_KEY));
        textView.setTag(args.getInt(ARG_POSITION_KEY));
        return textView;
    }
}
