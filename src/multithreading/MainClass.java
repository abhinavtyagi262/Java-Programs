package multithreading;

public class MainClass {
    public static void main(String[] args)
    {	
    	//Thread created by extending Thread class
    	Thread1 thread1 = new Thread1(); // Creating object of our thread class inside main() method 
    	thread1.start(); // Starting the thread
  
    	//Thread created by implementing Runnable interface
		Thread2 thread2 = new Thread2(); // Creating object of our thread class inside main() method
		Thread thread = new Thread(thread2); // Passing the object to thread in main()
		thread.start(); // Starting the thread
		
		Thread1 thread3 = new Thread1(); //Similarly we can create multiple threads
		thread3.start();
    }

}
