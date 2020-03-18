package com.idevelope.carz20.ui.sellcar;

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

import com.idevelope.carz20.R;

public class SlellCarFragment extends Fragment {

    private SellCarViewModel sellCarViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        sellCarViewModel = ViewModelProviders.of(this).get(SellCarViewModel.class);

        View root = inflater.inflate(R.layout.fragment_sell_car, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);

        sellCarViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}