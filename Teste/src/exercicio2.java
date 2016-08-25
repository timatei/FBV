import javax.swing.JOptionPane;

public class exercicio2 {

	public static void main(String [] args){
		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Exercicio 2 - Figura Geometrica\n\nDigite 1 para calcular a �rea de uma figura"
				+ "\nDigite 2 para calcular o volume de uma figura"));
	
		if (escolha == 1){
			int escolha2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o tipo abaixo\n\n"
					+ "1 para �rea de um c�rculo\n"
					+ "2 para �rea de um tr�angulo\n"
					+ "3 para �rea de um ret�ngulo\n"
					+ "4 para �rea de um trap�zio\n"
					+ "0 para voltar ao �nicio"));	
			
			user(escolha2);	
		}else{
			int escolha3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma das op��es abaixo\n\n"
					+ "1 para volume de uma esfera\n"
					+ "2 para volume de um cilindro\n"
					+ "3 para volume de um cubo\n"
					+ "4 para volume de um paralelepipedo\n"
					+ "0 para voltar ao �nicio"));
			user2(escolha3);
		}
	}

	static void user(int num1){
		switch (num1){
		case 1:
			circulo();
			break;
		
		case 2:
			triangulo();
			break;
			
		case 3:
			retangulo();
			break;
			
		case 4:
			trapezio();
			break;
			
		case 0:
			main(null);
			break;
		
		default:
			JOptionPane.showMessageDialog(null,"Nenhuma op��o v�lida foi informada.\n"
					+ "Programa sendo encerrado.");
			break;
		}
	}
	
	static void user2(int num1){
		switch (num1){
		case 1:
			esfera();
			break;
		
		case 2:
			cilindro();
			break;
			
		case 3:
			cubo();
			break;
			
		case 4:
			paralelepipedo();
			break;
			
		case 0:
			main(null);
			break;
		
		default:
			JOptionPane.showMessageDialog(null,"Nenhuma op��o v�lida foi informada.\n"
					+ "Programa sendo encerrado.");
			break;
		}
	}
	public static void circulo(){
		double raio = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o raio do c�rculo:"));
		raio =  ((raio * raio) * Math.PI);
		JOptionPane.showMessageDialog(null, "o �rea do circulo �: "+raio);
	}
	 public static void triangulo(){
		 int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a altura do triangulo:"));
		 int largura = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a largura do triangulo:"));
		 int area = (altura * largura) / 2;
		 JOptionPane.showMessageDialog(null, "o �rea do triangulo �: " +area);
	 }
	public static void retangulo(){
		 int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a altura do retangulo:"));
		 int largura = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a largura do retangulo:"));
		 int area = (altura * largura);
		 JOptionPane.showMessageDialog(null, "o �rea do retangulo �: " +area);
	}
	public static void trapezio(){
		int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a altura do trapezio:"));
		int basemenor = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tamanho da base menor do trapezio:"));
		int basemaior = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o tamanho da base maior do trapezio:"));
		int area = ((basemenor + basemaior)/2) * altura;
		JOptionPane.showMessageDialog(null, "a �rea do trapezio �: " +area);
	}
	public static void esfera(){
		double raio = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o raio da esfera"));
		double volume = ((4*Math.PI)*(raio*raio*raio))/3;
		JOptionPane.showMessageDialog(null, "o volume da esfera �: " +volume);
	}
	public static void cilindro(){
		double altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a altura do cilindro:"));
		double raio = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o raio do cilindro:"));
		double volume = (Math.PI*(raio*raio)*altura);
		JOptionPane.showMessageDialog(null, "o volume do cilindro �: "+volume);
	}
	public static void cubo(){
		int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a altura do cubo:"));
		int volume = (altura * altura * altura);
		JOptionPane.showMessageDialog(null, "o volume do cubo �: "+volume);
	}
	public static void paralelepipedo(){
		int comprimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a altura do paralelepipedo:"));
		int largura = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o raio do paralelepipedo:"));
		int altura = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o raio do paralelepipedo:"));
		int volume = (comprimento * altura * largura);
		JOptionPane.showMessageDialog(null, "o volume do paralelepipedo �: "+volume);
	}
}
