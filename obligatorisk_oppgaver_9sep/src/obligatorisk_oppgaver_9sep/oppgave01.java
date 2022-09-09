package obligatorisk_oppgaver_9sep;

import javax.swing.JOptionPane;

public class oppgave01 {
	public static void main(String[] args) {

		// Variabler
		double skatt = 0;
		int trinn = 0;
		String outTxt = "";

		// Skattetrinn. {F.O.M, sats}
		double[][] Skattetrinn = 
			{ { 0.0, 0.0 }, { 190350, 0.017 }, { 267900, 0.04 }, { 643800, 0.134 },
				{ 969200, 0.164 }, { 2000000, 0.174 }, { Double.MAX_VALUE } };

		// legger inn input.
		int bruttoinntekt = Integer.parseInt(JOptionPane.showInputDialog("Bruttoinntekt: "));

		// finner skattetrinn
		for (int i = 0; i < Skattetrinn.length - 1; i++) {
			if (bruttoinntekt >= Skattetrinn[i][0] && bruttoinntekt <= Skattetrinn[i + 1][0]) {
				trinn = i;
			}
		}

		// Legger til trinnskatt for alle trinn
		for (int i = 0; i < trinn; i++) {
			double trinnskatt = Math.round((Skattetrinn[i + 1][0] - Skattetrinn[i][0]) * Skattetrinn[i][1]);
			outTxt += "\nSkatt på trinn " + i + ": " + (int) trinnskatt + "kr";
			skatt += trinnskatt;
		}

		// Legger til trinnskatt for trinnet vi befinner oss i
		if (trinn > 0) {
			double trinnskatt_sistetrinn = Math.round((bruttoinntekt - Skattetrinn[trinn][0]) * Skattetrinn[trinn][1]);
			
			outTxt += "\nSkatt på trinn " + trinn + ": " + (int) trinnskatt_sistetrinn + "kr";
			skatt += trinnskatt_sistetrinn;
		}

		// Viser resultat
		outTxt += "\n\nTotal trinnskatt: " + (int) skatt + "kr \nNettoinntekt: " + (int) (bruttoinntekt - skatt) + "kr";
		
		System.out.println(outTxt);
		
		JOptionPane.showMessageDialog(null, outTxt);
	}
}