import java.util.Scanner;  
public class exercicio6{  
   public static void main(String[] args) {  
      int n;  
      int num =1;  
  
      while (num <= 5){  
         n=1;  
  
         while (n<=10){  
            System.out.println(num + " x " + n + " = " + num*n);  
            n++;  
         }  
         num++;  
     System.out.println("Aperte Enter Para a Proxima");  
         Scanner sc = new Scanner(System.in);  
         sc.nextLine();  
               }  
   }  
   }  