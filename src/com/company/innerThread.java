package com.company;

public class innerThread implements Runnable {
    @Override
    public void run() {
        try{
            System.out.println("Running inner thread");
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
            System.out.println("outer Thread interrupted");
            return;
        }
        System.out.println("End of innerThread reached");
    }
}
