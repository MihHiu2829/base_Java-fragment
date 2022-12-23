package com.example.movieapp.ViewModel;

import com.example.movieapp.API.Req.createSission;
import com.example.movieapp.API.Res.getAuthen;
import com.example.movieapp.Storage.App;
import com.example.movieapp.Storage.CommonUtils;
import com.example.movieapp.Storage.Storage;

public class m001_loginVM extends BaseViewModel_API
{
    private static final String TAG = m001_loginVM.class.getName() ;
    public static final String KEY_API_AUTHEN = "KEY_API_AUTHEN";
    public static final String CREATE_SISSION = "CREATE_SISSION";


    public void getAuthen()
    {
        getAPI().getAuthen().enqueue(initHandleResponse(KEY_API_AUTHEN));
    }

    @Override
    protected void handleSuccess(String key, Object body) {
        if(key.equals("KEY_API_AUTHEN"))
        {
            getAuthen reponse =(getAuthen) body ;
            callBack.apiSuccess(key,body);
            getAPI().createSission(new createSission
                    (App.getInstance().getStorage().username,App.getInstance().getStorage().passsword, reponse.requestToken))
                    .enqueue(initHandleResponse(CREATE_SISSION));
        }else if(key.equals(CREATE_SISSION))
        {
            callBack.apiSuccess(key,body);
        }
    }
}
