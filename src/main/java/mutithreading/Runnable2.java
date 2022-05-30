package mutithreading;

import java.util.concurrent.locks.Lock;

public class Runnable2 implements Runnable{
    private Lock lock1 = null;
    private Lock lock2 = null;

    public Runnable2(Lock lock1, Lock lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {

        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " attempting to lock lock2");
        lock2.lock();
        System.out.println(" locked lock2");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(threadName + " attempting to lock lock1");
        lock1.lock();
        System.out.println(" locked lock1");

        //do work

        System.out.println("Unlocking lock2");
        lock2.unlock();
        System.out.println("Unlocking lock1");
        lock1.unlock();


    }

}
