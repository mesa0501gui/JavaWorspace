package tw.org.iii.java;

public class Brad99 {

	public static void main(String[] args) {
		for (int k = 0; k < 5; k++) {
			for (int j = 1; j <= 9; j++) {
				for (int i = 2; i <= 5; i++) {
					int newi = i + k * 4;
					int result = newi * j;
					System.out.print(newi + " x " + j + " = " + result + "\t");
				}
				System.out.println();
			}
			System.out.println("---");
		}
	}

}
