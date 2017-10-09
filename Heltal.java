import javax.swing.*;
/*  Programmet läser in heltal n sedan beräknas summan.
	Benjamin Bylund
	2017-10-09
	(1+4+9+16+...n^2)
*/
public class Heltal{
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("N"));
		int summa = 0;
		int k = 1;
		while(k <= n){
			summa += k*k;
			k++;
		}
		JOptionPane.showMessageDialog(null, "Summan blir: " + summa);
	}
}