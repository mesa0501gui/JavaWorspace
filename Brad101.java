package tw.org.iii.java;

public class Brad101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]P=new int[9] ; //new出6個空間記憶體
		for (int icount = 0; icount < 100; icount++) {
			
			double dice = Math.random();
			int dicecount = (int) (dice * 5); //骰子0-5點
			P[dicecount]++;
		
		}
		//TODO NOT FINISH
		for(int i=0;i<P.length;i++){
			System.out.println(P[i]);		
		}
		
		
	}

}
