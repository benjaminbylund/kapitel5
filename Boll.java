import javax.swing.*;
/*  Programmet beräknar hur många studs bollen gör innan den stannar
	Benjamin Bylund
	2017-10-09
*/	

public class Boll{
	public static void main(String[] args) {
		
		double h = Double.parseDouble(JOptionPane.showInputDialog(null, "boll hojd"));
		int b = 0;

		while(h >= 1){
			h = h * 0.7;
			b = b + 1;
		}
		JOptionPane.showMessageDialog(null,"studsar: " + b);
	}	
}