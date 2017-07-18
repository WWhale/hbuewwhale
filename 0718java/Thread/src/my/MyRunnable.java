package my;

/**
 * Created by lanouhn on 17/7/18.
 */
public class MyRunnable implements Runnable{
/*
 *  线程是Thread MyRunnable是不是一个Thread？
 *  MyRunnable不是一个线程 只是一个可执行的类 实现了Runnable
 */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("我是runnable");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
