package com.dd.event;

/**
*
*描述：Boss 模拟老板
*
*撸码人：Administrator
*
*日期：2018/5/31 18:12
*/
public class Boss {
    public void resolve(int res){
        System.out.println("老板我知道答案："+res);
    }
    
    public void workOfBoss(){
        System.out.println("老板遇到问题，马上开启线程，创建B员工去办事");
        new MyThread().start();
    }
    class MyThread extends Thread{
        public void run(){
            Staff s=new Staff();
            //这里创建一个匿名内部类实现了Listener接口
            s.workOfSatff(1, 2, new MyListener() {
                @Override
                public void finish(int result) {// 并且实现了Listener的方法,方法内容是
                    resolve(result);//当B完成任务之后 希望执行的代码.
                }
            });
        }
    }
}
