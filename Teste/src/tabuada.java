import javax.swing.JOptionPane;

public class tabuada {

	public static void main(String[] args) {
			int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Tabuada"));
			for (int j = 1; j<=10; j++){
				System.out.println (i+" x "+ j + " = " + i*j);
			}
		}
	}

	