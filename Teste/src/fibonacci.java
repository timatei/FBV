import javax.swing.JOptionPane;

public class fibonacci {
    public static void main(String[] args) {
      System.out.printf("Serie de Fibonacci\n");
      System.out.printf("==================\n");
      
      int termo1 = 1, termo2 = 1, novoTermo;
      int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Termo"));
      System.out.printf(" 1o. termo = %d\n", termo1);
      System.out.printf(" 2o. termo = %d\n", termo2);
      for (int i=3; i<=x; i++) {
        novoTermo = termo1 + termo2; 
        System.out.printf("%2do. termo = %d\n", i, novoTermo);
        termo1 = termo2;	
        termo2 = novoTermo; 
      }
      System.out.printf("==================\n");
    }
}