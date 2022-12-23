package com.example.movieapp.View.FRG;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.movieapp.ViewModel.CommonVm;
import com.example.movieapp.databinding.M000FrgBinding;

public class m000_frg extends baseFRG<M000FrgBinding, CommonVm> {
    @Override
    protected void initViews() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                            callBack.showFragment(m001_frg.class.getName(),null,false);
            }
        },1000 ) ;
    }

    @Override
    protected Class<CommonVm> ClassVM() {
        return CommonVm.class;
    }

    @Override
    protected M000FrgBinding initViewBindings(LayoutInflater inflater, ViewGroup container) {
        return M000FrgBinding.inflate(inflater,container,false);
    }
}
