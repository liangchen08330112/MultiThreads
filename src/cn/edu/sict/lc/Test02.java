package cn.edu.sict.lc;

public class Test02 extends Thread{
    //定义100张票
    int ticket=100;

    public static void main(String[] args) {
        //新建两个线程
        Test02 test = new Test02();
        Test02 test2 = new Test02();
        //开启两个线程，不是run()而是start()
        test.start();
        test2.start();
    }
    public void run(){
        //车票大于0
        while(ticket>0){
            try {
                //线程暂停50毫秒
                Thread.sleep(50);
                //输出结果，其中包含线程名和车票数
                System.out.println("窗口"+Thread.currentThread().getName()+"卖出第"+ticket+"张票");
                //车票减少
                ticket--;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
