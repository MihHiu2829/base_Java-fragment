package com.example.movieapp.View.FRG;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.movieapp.ViewModel.BaseViewModel_API;
import com.example.movieapp.ViewModel.CommonVm;
import com.example.movieapp.databinding.M003MainpageBinding;

public class m002_frg extends baseFRG<M003MainpageBinding, CommonVm> {
    @Override
    protected void initViews() {

    }

    @Override
    protected Class<CommonVm> ClassVM() {
        return CommonVm.class;
    }

    @Override
    protected M003MainpageBinding initViewBindings(LayoutInflater inflater, ViewGroup container) {
        return M003MainpageBinding.inflate(inflater,container,false);
    }
}
