package com.dd.coach;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
*
*描述：MainActivity
*
*撸码人：linzi
*
*日期：2018/6/1 13:22
*
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv=findViewById(R.id.tv);
        tv.setText("我是动态内容activity...");
        Button btn=findViewById(R.id.btn);
        btn.setText("按钮点击+");
        btn.setOnClickListener(new BtnClickListener());
    }

    class BtnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent();
            intent.putExtra("show","I can fly");
            intent.setClass(MainActivity.this,DodActivity.class);
            MainActivity.this.startActivity(intent);
           // Boss b=new Boss();
           // b.workOfBoss();
        }
    }
}
