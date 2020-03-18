package com.idevelope.carz20.ui.buyspare;

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

public class BuySpareFragment extends Fragment {

    private BuySpareViewModel buySpareViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        buySpareViewModel = ViewModelProviders.of(this).get(BuySpareViewModel.class);

        View root = inflater.inflate(R.layout.fragment_buy_spare, container, false);
        final TextView textView = root.findViewById(R.id.textView);

        buySpareViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);
            }
        });
        return root;
    }
}