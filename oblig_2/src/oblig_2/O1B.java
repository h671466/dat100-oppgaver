package oblig_2;

public class O1B {

	
	public static void skrivUtv1(int[][] matrise) {
		
		
		for (int rad = 0; rad < matrise.length; rad++)
			
			for (int kollonne = 0; kollonne < matrise[rad].length; kollonne++) {
				

				
				System.out.println(matrise[rad][kollonne]);
				
		    }
		
    }
	
	
	public static String tilStreng(int[][] matrise) {
		
		String linje = "";
		
		for (int rad = 0; rad < matrise.length; rad++) {
			
			for (int kollonne = 0; kollonne < matrise[rad].length; kollonne++) {
				
				linje += matrise[rad][kollonne] + " ";
					
			//	System.out.println(matrise[rad][kollonne]);
				
		    }
		
			linje += "/n";
			
		}
		
		return linje;
		
	}
	
	
	public static int[][] skaler(int tall, int[][] matrise){
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
		System.out.println(tilStreng(a));
		
	}

}
