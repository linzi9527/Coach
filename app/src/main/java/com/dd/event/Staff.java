package com.dd.event;

import android.util.Log;
/**
*
*描述：Staff模拟员工
*
*撸码人：Administrator
*
*日期：2018/6/1 17:14
*
*/
public class Staff {
    MyListener myListener;
    public void workOfSatff(int i,int j,MyListener listener){
        this.myListener=listener;
        try {
            for (int c=1;c<=5;c++){
                Thread.sleep(1000);
                System.out.println("staff正在思考了"+c+"秒");
                Log.i("msg","staff正在思考了"+c+"秒");
            }
        }catch (InterruptedException e){}
        int result=i+j;
        myListener.finish(result);
    }
}
