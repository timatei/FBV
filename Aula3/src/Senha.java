import javax.swing.*;  
public class Senha {  
    public static void main(String[] args) {          
        String cadastroSenha;  
        String confirmaSenha;  
        double a;  
        double b;  
      
        cadastroSenha = JOptionPane.showInputDialog(null,"Senha","",JOptionPane.QUESTION_MESSAGE);  
          
        a = Double.parseDouble(JOptionPane.showInputDialog(null,"Primeiro n�mero","",JOptionPane.QUESTION_MESSAGE));  
        b = Double.parseDouble(JOptionPane.showInputDialog(null,"Segundo  n�mero","",JOptionPane.QUESTION_MESSAGE));  
          
        confirmaSenha = JOptionPane.showInputDialog(null,"Digite sua senha","",JOptionPane.QUESTION_MESSAGE);  
          
        if (confirmaSenha.equals(cadastroSenha)){  
            System.out.println(a/b);  
        }else{  
            System.out.println("Senha incorreta");  
        }  
          
        System.exit(0);  
    }  
  
}  