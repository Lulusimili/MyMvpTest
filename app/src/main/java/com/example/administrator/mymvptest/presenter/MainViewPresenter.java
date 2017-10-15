package com.example.administrator.mymvptest.presenter;

import com.example.administrator.mymvptest.View.IMainView;
import com.example.administrator.mymvptest.model.IMainViewModel;
import com.example.administrator.mymvptest.model.MainViewModel;

/**
 * Created by Administrator on 2017/10/14 0014.
 */

public class MainViewPresenter {
    private IMainView mIMainView;
    private IMainViewModel mMainViewModel;
    public MainViewPresenter(IMainView View){
        mIMainView=View;
        mMainViewModel=new MainViewModel();
    }
    /*public void showResponse(){
        mIMainView.showText(mMainViewModel.getResponse());
    }*/
    public String showResponse() {
      return   mMainViewModel.getResponse();
    }
}
