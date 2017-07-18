package my;

/**
 * Created by lanouhn on 17/7/18.
 */
public class MyThread extends Thread {
    /*
        thread是线程类 我们继承了它
        MyThread就是一个线程了
        当线程开启的时候 就会执行线程的run方法
        当线程的run方法执行结束后 线程就停止了
        但是线程对象还存在与内存中 等待GC回收(Garbage collection垃圾回收机制)
     */

//    一个注解 用来检测run方法是否从父类或超类中继承或实现过来的

    @Override
    public void run() {
        super.run();
        System.out.println("xx");
        for (int i = 0; i < 10; i++) {
            //当线程执行sleep时 会睡一秒
            //一秒之后该线程继续执行
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
