package cn.edu.sict.lc;

public class Test03 implements Runnable{
    int ticket=100;
    @Override
    public void run() {
        while (ticket>0){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("窗口"+Thread.currentThread().getName()+"已卖出第"+ticket+"张票");
            ticket--;
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new Test03();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}
