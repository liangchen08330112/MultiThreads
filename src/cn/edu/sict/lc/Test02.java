package cn.edu.sict.lc;

public class Test02 extends Thread{
    int ticket=100;

    public static void main(String[] args) {
        Test02 test = new Test02();
        Test02 test2 = new Test02();
        test.start();
        test2.start();
    }
    public void run(){
        while(ticket>0){
            try {
                Thread.sleep(50);
                System.out.println("窗口"+Thread.currentThread().getName()+"卖出第"+ticket+"张票");
                ticket--;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
