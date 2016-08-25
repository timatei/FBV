import java.util.Scanner;

import javax.swing.JOptionPane;


public class notas {


	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o valor da Nota 1: ");
		int nota1 = s.nextInt();
		
		System.out.println("Digite o valor da nota2: ");
		int nota2 = s.nextInt();
		
		int media = (nota1+nota2)/2;
		
		if (media>=9){
			System.out.println( "O Conceito do Aluno e A");
		}else if (media >=7){
			System.out.println( "O Conceito do Aluno e B");
		}else if (media>=5){
			System.out.println( "O Conceito do Aluno e C");
		}else if (media>=3){
			System.out.println( "O Conceito do Aluno e D");
		} else {
			System.out.println( "O Conceito do Aluno e F");
		}
		if (media>=5){
			System.out.println( "O Aluno Foi Aprovado :) ");
		}else{ 
			System.out.println( "O Aluno foi Reprovado :( "); 
		}
	}

}
