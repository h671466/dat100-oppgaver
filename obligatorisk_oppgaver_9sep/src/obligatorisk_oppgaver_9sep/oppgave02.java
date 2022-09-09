package obligatorisk_oppgaver_9sep;


import java.util.Scanner;

import javax.swing.JOptionPane;

public class oppgave02 {

	public static void main(String[] args) {

		// Karakterskala
		String[][] karakterer = 
			{ { "0", "F" }, { "40", "E" }, { "50", "D" }, { "60", "C" }, { "80", "B" },
				{ "90", "A" }, { "101" } };

		// Max inputs
		int maxInput = 10;
		int inputNr = 0;

		// lager scanner for å kunne ha input
		Scanner input = new Scanner(System.in);

		// loop
		while (inputNr < maxInput) {

			// skaffer input fra scanner
			System.out.println("Student nummer " + (inputNr + 1) + ": Poengsum:");
			
			String poengstr = input.nextLine();

			// Try for å parse input
			try {
				int poengsum = Integer.parseInt(poengstr);
				String karakter;

				// Skjekker om poengsum er gyldig
				if (poengsum >= 0 && poengsum <= 100) {

					// Skjekker karakter og skriver det ut
					for (int i = 0; i < karakterer.length - 1; i++) {
						if (poengsum >= Integer.parseInt(karakterer[i][0])
								&& poengsum < Integer.parseInt(karakterer[i + 1][0])) {
							karakter = karakterer[i][1];
							System.out.println("Karakter: " + karakter + "\n");
							inputNr++;
						}
					}
				} else {

					// Poengsum er ugyldig
					System.out.println("Ugyldig poengsum, prøv igjen. \n");
				}
			} catch (NumberFormatException e) {

				// Poengsum er ikke en gyldig double
				JOptionPane.showMessageDialog(null, "Poengsum er ikke ett tall.");
			} catch (Exception e) {

				// Annen feil
				JOptionPane.showMessageDialog(null, "Noe gikk galt, prøv igjen.\n" + e.getMessage());
			}
		}
		input.close();
	}
}