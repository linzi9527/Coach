package com.dd.coach;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/**
*
*描述：DodActivity
*
*撸码人：Administrator
*
*日期：2018/5/31 18:12
*/
public class DodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dod);
        Intent intent=getIntent();
        String txt=intent.getStringExtra("show");
        TextView tv=findViewById(R.id.dod_tv);
        tv.setText("我看到你了:"+txt);

        Button btn=findViewById(R.id.dod_btn);
        btn.setText("我是Dod,返回首页Main");
        btn.setOnClickListener(new BtnClickListener());
    }

    class BtnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.setClass(DodActivity.this,MainActivity.class);
            DodActivity.this.startActivity(intent);
        }
    }
}
