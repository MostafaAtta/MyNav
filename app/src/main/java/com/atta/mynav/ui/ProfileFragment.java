package com.atta.mynav.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.atta.mynav.R;

public class ProfileFragment extends Fragment {

    View root;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        root = inflater.inflate(R.layout.fragment_profile, container, false);

        TextView textView = root.findViewById(R.id.profile_tv);

        textView.setText("Profile");

        return root;
    }
}