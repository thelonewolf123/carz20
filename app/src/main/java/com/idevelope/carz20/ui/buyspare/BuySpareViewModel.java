package com.idevelope.carz20.ui.buyspare;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BuySpareViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BuySpareViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is share fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}