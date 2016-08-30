package tw.org.iii.java;

public class Brad100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p1,p2,p3,p4,p5,p6 ;
	    p1=p2=p3=p4=p5=p6=0;
		for (int icount = 0; icount < 100; icount++) {
			
			double dice = Math.random();
			int dicecount = (int) (dice * 6 + 1);
		switch(dicecount){
		case 1: p1++ ;  break;
		case 2: p2++ ;  break;
		case 3: p3++ ;  break;
		case 4: p4++ ;  break;
		case 5: p5++ ;  break;
		case 6: p6++ ;  break;
		}
		
		}
		System.out.println(p1);
	}

}
