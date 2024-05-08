package com.anu.lambda;

class ThreadDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("this is the run method in Thread ");
	}
}

public class RunnableThreadLambdaExample {
	public static void main(String[] args) {

		ThreadDemo td = new ThreadDemo();
		Thread thread = new Thread(td);
		thread.start();
		// normal way to use Runnable Thread example

		Runnable run = () -> {
			System.out.println("thread started using lambda");
		}; // lambda using the runnable method
		Thread thread1 = new Thread(run);
		thread1.start();
	}
}
