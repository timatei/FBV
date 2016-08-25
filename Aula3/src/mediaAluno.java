import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;


public class mediaAluno {

	
	public static void main(String[] args) {
		
	

	double nota1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digita a Nota 1:"));
	double nota2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digita a Nota 2:"));
	double nota3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digita a Nota 3:"));
	
	double media = (nota1+nota2+nota3)/3;
	
	JOptionPane.showMessageDialog(null,"A Media e: " +media);
	
	if (media>=5){
		JOptionPane.showMessageDialog(null, "Aprovado");
	}else if (media >=4){
		JOptionPane.showMessageDialog(null, "Aluno na Final, procure a Coordenação");
	}else if (media>=3){
		JOptionPane.showMessageDialog(null, "Aluno em Revisão de Nota");
	} else {
		JOptionPane.showMessageDialog(null, "Aluno Reprovado");
	}
	
	
	
	/*int nota1 = 2;
	int nota2 = 5;
	int media = (nota1+nota2)/2;
	
	System.out.print(" A media do aluno e: " + media);*/
	
}
	
}

