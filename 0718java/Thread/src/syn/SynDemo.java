package syn;

public class SynDemo {
   //synchronized 关键字 表示同步 可以用来修饰代码 也可以用来修饰方法

    private  static int count = 0;

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
}
