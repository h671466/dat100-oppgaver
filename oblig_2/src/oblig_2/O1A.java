package oblig_2;

public class O1A {
	public static void skrivUt (int[] tabell) {
	
		//skriver ut hvert tall i tabellen
		for (int i = 0; i < tabell.length; i++) {
			
		System.out.println(tabell[i]);
		
		}
	}
		
	
		public static String tilStreng (int[] tabell) {
			
			String startlinje = "[";
			
			for (int i = 0; i < tabell.length; i++) {
				
				if(i < tabell.length - 1) {
				
					startlinje += tabell[i] + ", ";
					
				} else {
					
					startlinje += tabell[i];
					
				}	
		}
		
		startlinje += "]";
		return startlinje;

	}
		
	
	public static int summer (int[] tabell) {
		
		
		int sum = 0;
		
     /* for loop	
       
		for (int i = 0; i < tabell.length; i++) {
			
			sum += tabell[i];
			
		}*/
		
		/*while loop
		
		int i = 0;
		while(i < tabell.length) {
			
			sum += tabell[i];
			i++;
			
		} */
		
		// utvidet for løkke?
		for (int number: tabell){
			
			sum += number;
			
		}
		
		return sum;
		
	}
		
		
	public static boolean finnesTall (int[] tabell, int tall) {
		
		//sjekker etter tall i tabellen
		for (int i = 0; i < tabell.length; i++) {
			
			if(tabell[i] == tall) {
				
				return true;
				
			}
				
		}
		
		return false;
		
	}
	
	
	public static int posisjonTall (int[] tabell, int tall) {
		
		//finner indeksposisjon i tabellen
		for (int i = 0; i < tabell.length; i++) {
			
			if(tabell[i] == tall) {
				
				return i;
				
			}
		}
		
		return -1;
		
	}
	
	
	public static int[] reverser(int[] tabell) {
		
		
		int[] reversertTabell = new int [tabell.length];
		
		for (int i = 0; i < tabell.length; i++) {
			
			reversertTabell[tabell.length - 1 - i] = tabell[i];
			
		}
	
		return reversertTabell;
		
	}
	
	
	public static boolean erSortert (int[] tabell) {
		
		for (int i = 1; i < tabell.length; i++) {
			
			if(tabell[i] < tabell[i - 1]) {
				
				return false;
				
			}
				
		}
		
		return true;
		
	}
	
	
	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		
		//lager en tabell på lengde lik de to andre og setter dem sammen
		int sammensatt[] = new int [tabell1.length + tabell2.length];
		

		for (int i = 0; i < tabell1.length; i++) {
			
			sammensatt[i] = tabell1[i];
			
		}
		
		for (int i = 0; i < tabell2.length; i++) {
			
			sammensatt[tabell1.length + i] = tabell2[i];
			
		}
		
		return sammensatt;
		
	}
	
}
