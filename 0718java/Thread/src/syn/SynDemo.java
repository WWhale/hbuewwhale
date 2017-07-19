package syn;

public class SynDemo {
   //synchronized 关键字 表示同步 可以用来修饰代码 也可以用来修饰方法

    private  static int count = 0;

    //SynDemo.class是synchronized关键字
    //修饰方法时默认锁对象
    public static synchronized void add(){
        /*add方法被synchronized修饰
         *那么当线程A调用add方法时 线程A已经进入方法体中开始操作了
         * 这时候线程B如果要调用add方法
         * 需要等线程A执行完add才可以
         */
        for (int i = 0; i < 10000; i++) {
            count ++;
            System.out.println(Thread.currentThread().getName() + "---" +count);
        }
    }

    public static synchronized void del(){
        /*
         * del方法，也被synchronized修饰了
         * 这样del方法和add方法同步锁对象就是一个了
         * 都是syncDemo.class这个类对象
         * 所以当线程A进入到add方法时，线程A持有这个锁对象
         * 那么线程B要进入del方法时，无法持有这个锁对象，所以就进不来了
         *
         */
        for (int i = 0; i < 10000; i++) {
            count--;
            System.out.println(Thread.currentThread().getName() + "---" +count);
        }
    }
}
