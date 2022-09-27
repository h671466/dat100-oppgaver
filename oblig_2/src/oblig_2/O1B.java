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
				
		    }
		
			linje += "/n";
			
		}
		
		return linje;
		
	}
	
	
	public static int[][] skaler(int tall, int[][] matrise){
		
		int[][] skalertmatrise = new int [matrise.length][matrise.length];
		
		for (int rad = 0; rad < skalertmatrise.length; rad++) {
			
			for (int kollonne = 0; kollonne < skalertmatrise[rad].length; kollonne++) {
				
				skalertmatrise[rad][kollonne] = matrise[rad][kollonne] * tall;
				
		    }
			
		}

		return skalertmatrise;
		
	}
	
	
	public static boolean erLik(int[][] mat1, int[][] mat2) {
		
		if(mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
			
			return false;
			
		}
		
		
		for (int rad = 0; rad < mat1.length; rad++) {
			
			for (int kollonne = 0; kollonne < mat1[rad].length; kollonne++) {
				
				if(mat1[rad][kollonne] != mat2[rad][kollonne]) {
					
					return false;
					
				}
				
		    }
			
		}
		
		return true;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int tall = 3;
		int[][] matrise = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] matrise2 = {{1,2}, {4,5}, {7,8}};

		System.out.println(erLik(matrise, matrise2));
	}

}
