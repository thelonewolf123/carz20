package com.idevelope.carz20.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.idevelope.carz20.R;
import com.idevelope.carz20.ui.login.LoginFragment;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private LinearLayout loginPage;
    private LinearLayout helpPage;
    private LinearLayout buyCar;
    private LinearLayout sellCar;
    private LinearLayout buySpare;
    private View root;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);

        root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.username);

        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        initialize();
        initializeLogic();
        return root;
    }

    private void initialize(){
        loginPage= (LinearLayout) root.findViewById(R.id.account);
        helpPage = (LinearLayout) root.findViewById(R.id.help);
        buyCar   = (LinearLayout) root.findViewById(R.id.buycar);
        sellCar  = (LinearLayout) root.findViewById(R.id.sellcar);
        buySpare = (LinearLayout) root.findViewById(R.id.buyspare);
    }
    public void initializeLogic(){
        loginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), LoginFragment.class));
            }
        });

        helpPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getContext(),Help.class));
            }
        });

        sellCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getContext(),SellCar.class));
            }
        });

        buyCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getContext(),BuyCar.class));
            }
        });

        buySpare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(getContext(), Login.class));
            }
        });
    }
}