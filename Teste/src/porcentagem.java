import javax.swing.JOptionPane;  

public class porcentagem {  
    public static void main(String[] args) {  
          
        int codigoTaxaAumento;  
        float valorProduto;  
          
      
        valorProduto = Float.parseFloat(JOptionPane.showInputDialog(null,"R$","Valor do produto",JOptionPane.QUESTION_MESSAGE));  
        codigoTaxaAumento = Integer.parseInt(JOptionPane.showInputDialog(null,"Código","Código de taxa do aumento",JOptionPane.QUESTION_MESSAGE));  
          
        switch (codigoTaxaAumento) {  
        case 1: valorProduto = valorProduto + (valorProduto * 10 / 100);  
                JOptionPane.showMessageDialog(null,"R$ " + valorProduto,"Valor do produto com taxa de aumento",JOptionPane.PLAIN_MESSAGE);  
            break;  
              
        case 3: valorProduto = valorProduto + (valorProduto * 25 / 100);  
        JOptionPane.showMessageDialog(null,"R$ " + valorProduto,"Valor do produto com taxa de aumento",JOptionPane.PLAIN_MESSAGE);  
            break;  
              
        case 4: valorProduto = valorProduto + (valorProduto * 30 / 100);  
        JOptionPane.showMessageDialog(null,"R$ " + valorProduto,"Valor do produto com taxa de aumento",JOptionPane.PLAIN_MESSAGE);            
            break;  
              
        case 8: valorProduto = valorProduto + (valorProduto * 50 / 100);  
        JOptionPane.showMessageDialog(null,"R$ " + valorProduto,"Valor do produto com taxa de aumento",JOptionPane.PLAIN_MESSAGE);    
            break;  
              
        default: JOptionPane.showMessageDialog(null,"Código " + codigoTaxaAumento," Código de taxa de aumento desconhcido",JOptionPane.PLAIN_MESSAGE);  
            break;  
        }  
        
    }
}
    