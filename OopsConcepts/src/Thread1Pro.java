
public class Thread1Pro extends Thread {

	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread1Pro td = new Thread1Pro();

		Thread t1 = new Thread(td);

		t1.start();

	}
}
