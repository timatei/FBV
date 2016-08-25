import javax.swing.JOptionPane;

public class media2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1, nota2, nota3;
		double media;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digita a Nota 1 "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 2 "));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 3 "));
		media = (nota1+nota2+nota3)/3; JOptionPane.showMessageDialog(null, "A Media e "+media);
		
		
		/*double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite Nota1"));
double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite Nota2"));
double media;

media = (nota1 + nota2)/2; JOptionPane.showMessageDialog(null, "Sua Media " +media);
*/

	}

}
