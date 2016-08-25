import java.util.*;

public class valores{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        System.out.print(
      "Este programa permite calcular o MDC\n");
    System.out.print("Informe o primeiro n�mero: ");
    int x = in.nextInt();
    System.out.print("Informe o segundo n�mero: ");
    int y = in.nextInt();
    System.out.println("\nO M�ximo Divisor Comum de "
      + x + " e " + y + " � " + MDC(x, y));
  }
  public static int MDC(int a, int b){
    int resto;

    while(b != 0){
      resto = a % b;
      a = b;
      b = resto;
    }
    return a;
  } 
}
