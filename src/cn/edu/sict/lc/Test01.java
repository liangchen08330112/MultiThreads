package cn.edu.sict.lc;

public class Test01 extends Thread{
    int ticket=100;

    public static void main(String[] args) {
        Test01 test = new Test01();
        test.start();
    }
    public void run(){
        while(ticket>0){
            System.out.println("窗口"+Thread.currentThread().getName()+"已卖出第"+ticket+"张车票");
            ticket--;
        }
    }
}
