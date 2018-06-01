package com.dd.event;

/**
 * 1: 定义一个接口 MyListener
 * 2: A(boss)调用B(staff)的方法并在参数中传入一个接口实现类实例
 * 3: B中得到参数中的接口实现类实例,并执行完任务之后,调用接口实现类实例的方法.
 */
public interface MyListener {
  public void finish(int result);
}
