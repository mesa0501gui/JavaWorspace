package tw.org.iii.java;

public class Brad09 {
	public static void main(String[] args) {
		double temp = Math.random();
		int score = (int) (temp * 101); // 0 - 100
		System.out.println(score);
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}

	}
}
