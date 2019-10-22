package com.example.projectraptor.ui.MissionStatment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MissionStatusViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MissionStatusViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}