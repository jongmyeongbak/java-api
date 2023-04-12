package sample08list;

import java.util.ArrayList;
import java.util.Vector;

public class VectorApp1 {

	static Vector<Integer> numbers1 = new Vector<>();
	static ArrayList<Integer> numbers2 = new ArrayList<>();

	public static void main(String[] args) {
		VectorSample sample1 = new VectorSample();
		ArrayListSample sample2 = new ArrayListSample();

		Thread t1 = new Thread(sample2, "t1");
		Thread t2 = new Thread(sample2, "t2");
		Thread t3 = new Thread(sample2, "t3");
		Thread t4 = new Thread(sample2, "t4");
		Thread t5 = new Thread(sample2, "t5");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static class VectorSample implements Runnable {
		public void run() {
			for (int i = 0; i < 1000; i++) {
				System.out.println(Thread.currentThread().getName() + " -> " + i);
				numbers1.add(i);
			}
		}
	}

	static class ArrayListSample implements Runnable {
		public void run() {
			for (int i = 0; i < 1000; i++) {
				System.out.println(Thread.currentThread().getName() + " -> " + i);
				numbers2.add(i);
			}
		}
	}
}
