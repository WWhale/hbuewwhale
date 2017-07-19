package syn;

import sta.Student;

/**
 * Created by lanouhn on 17/7/19.
 */
public class CodeDemo {
    /*
     * 同步和异步
     * 同步：小红叫小明去吃饭 小明说等我化完妆
     *      小红就在门口等着 斗转星移 小明化完了 然后两人去吃饭了
     * 异步：小红叫小明吃饭 小明说你等我化完妆
     *      小红说mmp 我自己去了 小红就自己去吃饭了 小明继续化妆 化完就自己去吃饭了
     */
    private static Student stu = new Student();
    private static int count = 0;

    public void add(){
        //同步关键字 修饰代码块
        //同步只会影响到代码块中的内容
        //（stu)是锁
        //锁只是一个抽象概念 实际上就是一个对象
        //这个对象可以是任意的 非固定的
        //比如这里也可以不用stu
        //只要在当前类可以使用的对象
        //都可以写在这个括号里充当锁对象 count是变量 不行
        //比如 this, CodeDemo.class等
        //CodeDemo.class是类对象
        synchronized (stu) {
            count++;
        }
    }
}
