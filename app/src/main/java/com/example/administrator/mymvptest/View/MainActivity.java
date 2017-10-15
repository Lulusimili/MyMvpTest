package com.example.administrator.mymvptest.View;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.administrator.mymvptest.R;
import com.example.administrator.mymvptest.Util.OkHttpUtil;
import com.example.administrator.mymvptest.presenter.MainViewPresenter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,IMainView {
    private Button send_request;
    private TextView request_text;
    private MainViewPresenter mpresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        send_request.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
         if(view.getId()==R.id.send_request){
             showText();
             Toast.makeText(this,"hhh",Toast.LENGTH_SHORT).show();
         }
    }

    @Override
    public void showText() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
               request_text.setText( mpresenter.showResponse());
            }
        });
    }

    void init(){
        send_request=(Button)findViewById(R.id.send_request);
        request_text=(TextView)findViewById(R.id.request_text);
        mpresenter=new MainViewPresenter(this);
    }

}
