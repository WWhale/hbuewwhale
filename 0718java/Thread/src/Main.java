import excep.DataThread;
import life.FirstThread;
import life.SecondThread;
import my.MyRunnable;
import my.MyThread;
import org.junit.internal.runners.statements.RunAfters;
import syn.SynDemo;
import wait.DeadLock;
import wait.WaitDemo;

import javax.xml.crypto.Data;

/**
 * Created by lanouhn on 17/7/18.
 */
public class Main {
    public static void main(String[] args) {
        //summary();
        //showThread();
        //showRunnable();
        //showCreateThread();
        //showLife();
        //showDateException();
        //showSync();
        //showSync();
        //showDifference();
        //showDeadLock();
    }

    private static void showDeadLock() {
        //死锁是什么 一个人去面试 面试后 面试官给他打电话 我们觉得你各方面都很符合要求
        //你给我解释一下什么是死锁吧 解释完了我就给你发offer 这个人回答了一句你给我发Offer我就给你解释死锁
        //当一个锁对象被线程A持有 线程A在运行过程中 又需要另一个锁对象B
        //而锁对象B被线程B持有 线程B在运行过程中 又需要锁对象A
        //这时候 两个线程都在等待对方释放锁资源
        //这个状态就是死锁

        DeadLock deadLock = new DeadLock();

        new Thread(new Runnable() {
            @Override
            public void run() {
                deadLock.p1();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                deadLock.p2();
            }
        }).start();
    }

    private static void showDifference() {
        WaitDemo waitDemo  = new WaitDemo();
        new Thread(new Runnable() {
            @Override
            public void run() {
                waitDemo.showSleep();
            }
        }).start();

        try {
            //写这个代码 是为了保证上面的定义的线程 先执行
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                waitDemo.showWait();
            }
        }).start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                waitDemo.showNotify();
            }
        }).start();
    }

    private static void showSync() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                SynDemo.add();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                SynDemo.del();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                SynDemo.add();
            }
        }).start();
    }

    private static void showDateException() {
        DataThread dt1 = new DataThread();
        DataThread dt2 = new DataThread();
        DataThread dt3 = new DataThread();
        DataThread dt4 = new DataThread();

        dt1.start();
        dt2.start();
        dt3.start();
        dt4.start();
        System.out.println("********main方法执行完毕*******");
    }

    private static void showLife() {
        /*
         * 多线程能够提高效率 比如做A事的时候也可以做B事 即使A会耗费很长时间也不会耽误B事
         * 但是如果多线程涉及到了同一个资源 那么久有可能出现数据异常
         * 下面就是关于数据异常
         */
        FirstThread ft = new FirstThread();
        SecondThread st = new SecondThread(ft);
        ft.start();
        st.start();
        System.out.println("********main方法执行完毕*******");
    }

    private static void showCreateThread() {
        //第一种创建方法
//        new Thread();

        //第二种（常用）
        new Thread(new Runnable() {
            @Override
            public void run() {
                //这个线程要做的事情
                System.out.println("我是匿名内部类");
            }
        }).start();

        //第三种 变相继承
//        new Thread(){
//            @Override
//            public void run() {
//                super.run();
//                System.out.println("我也是匿名类");
//            }
//        }.start();
    }

    private static void showRunnable() {
        //自定义类 实现Runnable接口
        Thread t2 = new Thread(new MyRunnable());
        t2.start();
        //t2.run();
    }

    private static void showThread() {
//      自定义类 继承Thread类
        MyThread myThread = new MyThread();
//      执行start方法 才是开启了这个线程
//      那么这个线程才会与主线程抢占 这才谁多线程
//      如果执行run方法 只是对象调用方法而已
//      与我们刚刚写的dog.catchMouse没有区别
//      也不会开启多线程操作 依然是在主线程中执行
        myThread.start();
//      myThread.run();
        System.out.println(Thread.currentThread().getName());
    }

    private static void summary() {
        System.out.println("以下是概述");
//        进程是一个独立的程序单元 比如我们玩的游戏
//        一个游戏就可以当做一个进程
//        线程是进程中的一个更小的可执行单元
//        进程占据一块内存 内存中有它的独立使用的数据
//        线程是运行在进程中的 多个线程之间
//        可以共享进程中的数据
//        线程是抢占式运行的 哪个线程抢到了执行权
//        那么其他线程 就需要等该线程释放执行权以后
//        也就是其他线程抢到了执行权 才能执行
//        在java中使用线程
//        可以继承Thread类 也可以实心Runnable接口
//        大驼峰：PalyGame 小驼峰：playGame 类名要用大驼峰
//        方法名和对象名要用小驼峰
//        不能以数字开头 不可以使用汉字
    }

}
