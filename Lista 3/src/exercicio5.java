import java.util.Scanner;

public class exercicio5 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);  
    
    
    System.out.print("Informe um valor entre 1 e 10: ");
    int numero = Integer.parseInt(entrada.nextLine());
    
    if((numero < 1) || (numero > 10)){
      System.out.println("O número deve ser entre 1 e 10");
    }
    else{
     
      for(int i = 1; i <= 10; i++){
        System.out.println(numero + " X " + i + " = " + (numero * i));  
      }  
    }
    
    System.out.println("\n");
  }
}