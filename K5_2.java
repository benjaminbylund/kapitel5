import javax.swing.*;
/*  beräknar en harmonisk serie
	Benjamin Bylund
	2017-10-09
*/	
public class K5_2{
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("N"));
		double summa = 0;
		double k = 1;

		while(k <= n){
			summa += (double)1.0/k;
			k++;
		}
		JOptionPane.showMessageDialog(null, "Summan blir: " + summa);
	}
}