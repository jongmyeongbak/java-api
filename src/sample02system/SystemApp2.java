package sample02system;

import java.util.Arrays;

public class SystemApp2 {

	public static void main(String[] args) {
		int[] src = {10, 20, 30, 40, 50};
		int[] dest = new int[10];
		System.arraycopy(src, 0, dest, 0, src.length);
		System.out.println(Arrays.toString(dest));
	}
}
