public class Tenor extends Thread {
	static int count = 0;
	static Tenor t = new Tenor();

	public void run() {
		System.out.println(++count);
	}

	public static void main(String[] args) {
		t.start();
		t = new Tenor();
		t.start();
	}
}