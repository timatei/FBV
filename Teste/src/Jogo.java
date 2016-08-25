import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {

		ArrayList<String> cartas = new ArrayList<String>();
		ArrayList<String> nipes = new ArrayList<String>();
		Random r = new Random();

		cartas.add(0, "As");
		cartas.add(1, "2");
		cartas.add(2, "3");
		cartas.add(3, "4");
		cartas.add(4, "5");
		cartas.add(5, "6");
		cartas.add(5, "7");
		cartas.add(6, "8");
		cartas.add(7, "9");
		cartas.add(8, "10");
		cartas.add(9, "Valete");
		cartas.add(10, "Dama");
		cartas.add(11, "Rei");

		nipes.add(0, "copas");
		nipes.add(1, "ouro");
		nipes.add(2, "espadas");
		nipes.add(3, "paus");

		String carta = cartas.get(r.nextInt(cartas.size()));
		String nipe = nipes.get(r.nextInt(nipes.size()));

		Scanner s = new Scanner(System.in);
		System.out.println("escolha sua carta: ");
		String escolha = s.nextLine();
				String Resultado = (carta+ nipe);
				System.out.println("Sorteio: " + Resultado);
				
		if (escolha.equals(Resultado)) {
			System.out.println("correto");

		} else {

			System.out.println("errado");
		}
	}
}
	