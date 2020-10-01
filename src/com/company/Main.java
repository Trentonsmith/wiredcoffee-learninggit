package com.company;

public class Main {
/*
    NOTES: Thread.join(millis) pauses current thread and  runs the joined thread until it is done
    running or it has gone over the time control, if time control, both threads will continue running as if they were never joined
   */
    public static void main(String[] args) {
	innerThread out = new innerThread();
	Thread myInner = new Thread(out);
	myInner.start();
	new Thread(){
        @Override
        public void run() {
            System.out.println("Outer anonymous Thread running");
            try {
                myInner.join(1);
            }catch (InterruptedException e){
                System.out.println("Join method failed ");
                e.printStackTrace();
            }
            System.out.println("finished running outer Thread");
        }
    }.start();
    
    }
}
