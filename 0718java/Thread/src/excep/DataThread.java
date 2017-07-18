package excep;

/**
 * Created by lanouhn on 17/7/18.
 */
public class DataThread extends Thread{
    /*
     *  原子性操作
     *  int n = 1; 是原子性操作
     *  n = n - 1; 不是 这实际上是三次操作
     *  1.在内存中取出n的值
     *  2.将取出来的值与n做减法
     *  3.将得到的结果赋值给n
     *
     *  多线程操作的时候 很有可能当前的线程进行到第二步后就被抢走了执行权
     *  其他的线程获取n值的时候 还是第一步中的n的值
     *  实际上是进行了两次减法操作 但是只是显示一次的值
     *  这就是为什么会有减不到0的现象发生
     *
     *  关于数据顺序错乱
     *  线程A执行输出语句时 可能从内存中获取了当前的num的值 但是输出的那一刹那被抢走了执行权
     *  等A抢回来的时候 其他的线程已经输出了 所以A输出的值与顺序不符
     */


    /*
     * static 是静态的 num这个变量是类变量
     * 只要是DataThread对象就共享这个num
     */
    private static int num = 10000;

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 2500; i++) {
            num --;
            System.out.println(getName()+"----"+num);
        }
    }
}
