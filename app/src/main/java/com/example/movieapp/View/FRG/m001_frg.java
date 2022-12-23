package com.example.movieapp.View.FRG;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import com.example.movieapp.Storage.App;
import com.example.movieapp.ViewModel.BaseViewModel_API;
import com.example.movieapp.ViewModel.m001_loginVM;
import com.example.movieapp.databinding.M001LoginfrgBinding;

public class m001_frg extends baseFRG<M001LoginfrgBinding, m001_loginVM> {
    @Override
    protected void initViews() {
        binding.btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                App.getInstance().getStorage().username = binding.edtUn.getText().toString() ;
                App.getInstance().getStorage().passsword = binding.edtPw.getText().toString() ;
                viewModel.getAuthen();
            }
        });
        binding.tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(context, androidx.appcompat.R.anim.abc_fade_in));
                String link = "https://www.themoviedb.org/signup" ;
                Intent intent = new Intent(Intent.ACTION_VIEW) ;
                intent.setData(Uri.parse(link));
                startActivity(intent);
            }
        });
    }

    @Override
    public void apiSuccess(String key, Object data) {
        if(key.equals(m001_loginVM.KEY_API_AUTHEN))
        {
            Toast.makeText(context, "Aduuu, nhan access key roi nha", Toast.LENGTH_SHORT).show();
        }else if(key.equals(m001_loginVM.CREATE_SISSION))
        {
            callBack.showFragment(m002_frg.class.getName(),null,false);
        }
    }

    @Override
    protected Class<m001_loginVM> ClassVM() {
        return m001_loginVM.class;
    }

    @Override
    protected M001LoginfrgBinding initViewBindings(LayoutInflater inflater, ViewGroup container) {
        return M001LoginfrgBinding.inflate(inflater,container,false);
    }
}
