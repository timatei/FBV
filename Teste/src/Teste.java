import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Primeiro Numero"));
double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o Segundo Numero"));

double x = Math.pow (num1, num2);

JOptionPane.showMessageDialog(null, "Potencia e :" +x);
	}
}



	

