import javax.swing.JOptionPane;

public class Cigarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total;
		int anos = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos Anos voc� Fuma?"));
		anos = anos*365;
		int cigarrosdia = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos Cigarros por dia?"));
		double carteira = Double.parseDouble(JOptionPane.showInputDialog(null, "Pre�o da Carteira?"));
		int qtddia = cigarrosdia*365;
				
	 JOptionPane.showMessageDialog(null, "Voc� Fuma a " +anos+ " Dias!!");
	 
	 total = ((cigarrosdia/20)*carteira*anos); 
	 JOptionPane.showMessageDialog(null, "Voc� Gastou R$ "+total+" E Fumou "+qtddia+ "Durante Sua Vida!!" );
		
		
	}

}
