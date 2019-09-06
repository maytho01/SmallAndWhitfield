package com.example.smallandwhitfield.ui.catalogues;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CatalogueViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CatalogueViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Catalogues fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}