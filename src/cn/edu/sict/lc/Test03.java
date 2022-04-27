package cn.edu.sict.lc;

public class Test03 implements Runnable{
    //定义100张车票
    int ticket=100;
    //run方法
    @Override
    public void run() {
        //车票数大于0
        while (ticket>0){
            try {
                //让线程停50毫秒
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //输出结果，其中包含线程名和车票数
            System.out.println("窗口"+Thread.currentThread().getName()+"已卖出第"+ticket+"张票");
            //车票减少
            ticket--;
        }
    }

    public static void main(String[] args) {
        //新建Runnable对象
        Runnable runnable = new Test03();
        //新建两个线程
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        //启动线程
        thread1.start();
        thread2.start();
    }
}
