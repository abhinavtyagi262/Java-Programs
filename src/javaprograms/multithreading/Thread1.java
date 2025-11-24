package javaprograms.multithreading;

// Way 1
// Creating thread by extending Thread class
 
public class Thread1 extends Thread {
   
    public void run() // run() method for our thread
    {
        System.out.println("Thread: " + Thread.currentThread().getId() + " is running and created by extending Thread class");
    }
}