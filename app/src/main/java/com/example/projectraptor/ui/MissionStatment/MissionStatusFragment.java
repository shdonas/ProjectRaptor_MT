package com.example.projectraptor.ui.MissionStatment;

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

public class MissionStatusFragment extends Fragment {

    private MissionStatusViewModel missionStatusViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        missionStatusViewModel =
                ViewModelProviders.of(this).get(MissionStatusViewModel.class);
        View root = inflater.inflate(R.layout.fragment_mission_status, container, false);
        final TextView textView = root.findViewById(R.id.text_missionstatus);
        missionStatusViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}