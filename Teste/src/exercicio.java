import javax.swing.JOptionPane;

public class exercicio {

	public static void main(String [] args){
		int decisao = 1;
		while (decisao != 0){
		
	int escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 para ver se um n�mero � divis�vel por outro" +"\n"+
	"Digite 2 para calcular o MDC dos n�meros" + "\n"+
			"Digite 3 para ordenar em ordem crescente os n�meros"+"\n"+
	"Digite 0 para sair do programa"));
	
	decisao = escolha;
	
	switch (escolha){
	
	case 1:
		int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro n�mero"));
		divisivel(num1, num2);
		break;
		
	case 2:
		int num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero"));
		int num4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro n�mero"));
		System.out.println("o m�ximo divisor comum �:" +mdc(num3, num4));
		break;
		
	case 3:
		int num5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um n�mero"));
		int num6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro n�mero"));
		int num7 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite mais um n�mero"));
		ordem(num5, num6, num7);
		break;
		
	case 0:
		break;
	}
		
		}
	}
	static void divisivel(int num1, int num2){
		if (num1 % num2 == 0){
		System.out.println("os n�meros podem se dividir");
	
		} else {
		
		System.out.println("os n�meros n�o podem se dividir");
	}
	}
	
	public static int mdc(int num1, int num2){
	    int resto;

	    while(num2 != 0){
	      resto = num1 % num2;
	      num1 = num2;
	      num2 = resto;
	    }
	    return num1;
	    }
	
	public static void ordem(int num5, int num6, int num7){

		if (num5 > num6 && num5 > num7 && num6 > num7){
			
			JOptionPane.showMessageDialog(null, +num5+" "+num6+" "+num7);
			
			} else if (num5 > num6 && num5 > num7 && num7 > num6){
				
				JOptionPane.showMessageDialog(null, +num5+" "+num7+" "+num6);
				
				
				
			} else if (num6 > num5 && num6 > num7 && num5 > num7){
				
				JOptionPane.showMessageDialog(null, +num6+" "+num5+" "+num7);
				
			} else if (num6 > num5 && num6 > num7 && num7 > num5){
				
				JOptionPane.showMessageDialog(null, +num6+" "+num7+" "+num5);
				
				
				
			} else if (num7 > num5 && num7 > num6 && num5 > num6){
				
				JOptionPane.showMessageDialog(null, +num7+" "+num5+" "+num6);
				
			} else if (num7 > num5 && num7 > num6 && num6 > num5){
				
				JOptionPane.showMessageDialog(null, +num7+" "+num6+" "+num5);		
			}
	}
}


	
