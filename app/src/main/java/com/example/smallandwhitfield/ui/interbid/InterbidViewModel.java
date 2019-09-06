package com.example.smallandwhitfield.ui.interbid;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InterbidViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InterbidViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Interbid fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}