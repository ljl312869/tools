package com.concurrrncy;

/**
 * demonstration of the Runnable interfance
 */
public class LiftOff implements Runnable{
    protected int countDown=10;
    private static int taskCount=0;
    private final int id=taskCount++;
    public LiftOff(){

    }
    public LiftOff(int CounDown){
        this.countDown=countDown;
    }
    public String status(){
        return "#"+id+"("+(countDown>0?countDown:"liftoff")+"),";
    }

    /**
     * 当从Runable导出一个类时，它必须具有run()方法，但是这种方法并无特殊之处——他不会产生任何内在的线程能力。
     * 要实现线程行为，你必须显式的将一个任务附着到线程上。
     */
    @Override
    public void run(){
       while(countDown-->0){
           System.out.print(status());
           //在run()中对静态方法Thread.yield()的调用是对线程调度器的一种建议，
           //它在声明：“我已经执行完生命周期中最重要的部分了，此刻正是切换给其他线程执行一段时间的最好时机”
           //在这里是为了更有可能看到任务切进切出的证据
           Thread.yield();
       }

    }
}
