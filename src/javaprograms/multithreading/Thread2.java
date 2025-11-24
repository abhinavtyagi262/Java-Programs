package javaprograms.multithreading;

// Way 2
// Creating thread by implementing Runnable interface

public class Thread2 implements Runnable {

	public void run() // run() method for our thread
	{
		System.out.println("Thread: " + Thread.currentThread().getId() + " is running and created by implementing Runnable interface");
	}
}
