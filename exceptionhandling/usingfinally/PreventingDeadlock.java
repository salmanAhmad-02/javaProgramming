package usingfinally;

import java.util.concurrent.locks.ReentrantLock;

public class PreventingDeadlock {
    
    private final ReentrantLock lock = new ReentrantLock();
    private int count = 0;

   
    public void increment(int val) {
        for(int i = 1 ; i<= val; i++){
            lock.lock();    
            try{
                count++;
                System.out.println(Thread.currentThread().getName()+" Added "+i+" Tokens. Current total :"+count);
            }
            finally{
                lock.unlock();
            }
        }
    }

    public void printData() {
        System.out.println("Final Updated Total Count Is " + count);
    }

    public static void main(String[] args) throws InterruptedException {
        
        PreventingDeadlock sharedResource = new PreventingDeadlock();

        // Create threads that all target the SAME shared instance, 
        // but pass different values using lambda expressions.
        Thread t1 = new Thread(() -> sharedResource.increment(500), "Buyer-1");
        Thread t2 = new Thread(new Runnable(){
            @Override 
            public void run(){
                sharedResource.increment(1000);
            }},"Buyer-2");
        Thread t3 = new Thread(() -> sharedResource.increment(100), "Buyer-3");

        
        t1.start();
        t2.start();
        t3.start();

        
        t1.join();
        t2.join();
        t3.join();

        // final resource value
        sharedResource.printData();
    }
}