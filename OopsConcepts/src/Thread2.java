
public class Thread2 extends Thread {

	public void run() {
		int a[] = { 13, 23, 44, 55, 9, 6 ,2};
		int small = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < small) {
				small = a[i];

			}

		}
		System.out.println("the smallest element in the list is :" + small);

	}

	public static void main(String[] args) {
		Thread2 the = new Thread2();
		Thread t2 = new Thread(the);
		t2.start();
	}

}
