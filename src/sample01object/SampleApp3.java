package sample01object;

public class SampleApp3 {

	public static void main(String[] args) {
		Sample sample = new Sample(100, "홍길동");
		
		Sample cloneSample = sample.copy();
		System.out.println(sample);
		System.out.println(cloneSample);
		System.out.println(System.identityHashCode(sample));
		System.out.println(System.identityHashCode(cloneSample));
	}
}
