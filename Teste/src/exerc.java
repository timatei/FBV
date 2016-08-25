import javax.swing.JOptionPane;

public class exerc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1;
		double nota2;
		double nota3;
		double media;
		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota1"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota2"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota3"));
		media = (nota1+nota2+nota3)/3; JOptionPane.showMessageDialog(null, "A Media e " +media);
		
	}

}
