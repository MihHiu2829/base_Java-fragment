package com.example.movieapp.View.ACT;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.movieapp.R;
import com.example.movieapp.View.FRG.m000_frg;
import com.example.movieapp.ViewModel.BaseViewModel_API;
import com.example.movieapp.ViewModel.CommonVm;
import com.example.movieapp.ViewModel.mainVM;
import com.example.movieapp.databinding.ActivityMainBinding;

public class MainActivity extends baseACT<ActivityMainBinding, mainVM> {


    @Override
    protected int getIDmain() {
        return R.id.Ln_main01;
    }

    @Override
    protected void initViews() {
                showFragment(m000_frg.class.getName(),null,false);
    }

    @Override
    protected Class<mainVM> ClassViewModel() {
        return mainVM.class;
    }

    @Override
    protected ActivityMainBinding initViewBinding() {
        return ActivityMainBinding.inflate(getLayoutInflater());
    }
}