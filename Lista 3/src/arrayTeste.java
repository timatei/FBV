import java.util.Scanner;
public class arrayTeste {
        public static void main(String[] args){
            int[] nota = new int[3];
            Scanner entrada = new Scanner(System.in);
                        //recebendo os n�meros
            for(int indice=0 ; indice < 3 ; indice++){
                System.out.print("\nEntre com o n�mero " + (indice+1) + ": ");
                nota[indice] = entrada.nextInt();
            }
                        //exibindo os n�meros
            for(int indice=0 ; indice < 3 ; indice++){
                System.out.printf("N�mero %d -> Valor armazenado: %d\n",indice+1, nota[indice]);
            }
        }
}