import java.util.Scanner;
public class maiorNumeroWhile{
 
    public static void main(String[] args){
     float maior,
           num;
     int count=2;
     Scanner entrada = new Scanner(System.in);
 
     System.out.print("Numero 1: ");
     num = entrada.nextFloat();
     maior = num;
 
     while(count <= 10){
      System.out.print("Numero " + count + ": ");
      num = entrada.nextFloat();
 
      if(num > maior){
       maior = num;
      }
 
      count++;
     }
 
     System.out.println("O maior numero digitado é: "+maior);
 
    }
}