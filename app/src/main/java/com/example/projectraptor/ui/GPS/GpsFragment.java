package com.example.projectraptor.ui.GPS;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.projectraptor.R;

public class GpsFragment extends Fragment {

    private GpsViewModel gpsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        gpsViewModel =
                ViewModelProviders.of(this).get(GpsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gps, container, false);
        final TextView textView = root.findViewById(R.id.text_gps);
        gpsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}