package com.java8.lambda;

public class ThreadeDemo  implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<5;i++){
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		// normal way 
		ThreadeDemo rn= new ThreadeDemo();
		Thread t1=new Thread(rn);
		t1.start();
		
	
		Runnable rnt =  () ->{
			for(int i=1;i<5;i++){
				System.out.println(i);
			}
	};
	Thread t2=new Thread(rnt);
	t2.start();
	}

}
