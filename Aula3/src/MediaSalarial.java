import javax.swing.JOptionPane;  
public class MediaSalarial {  
    public static void main(String[] args) {  
  
        int quantidadeFuncionarios = 0;  
        float salarioFuncionario = 0;  
        float totalSalarios = 0;  
        float mediaSalarial = 0;  
        //vari�vel contadora para la�o  
        int contadora = 0;  
          
        quantidadeFuncionarios = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade de funcion�rios","N�mero de funcion�rios",JOptionPane.QUESTION_MESSAGE));  
          
        while (contadora < quantidadeFuncionarios){  
            contadora++;  
            salarioFuncionario = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o sal�rio do funcion�rio","Sal�rio",JOptionPane.QUESTION_MESSAGE));  
            totalSalarios = totalSalarios + salarioFuncionario;  
        }  
          
        mediaSalarial = totalSalarios / quantidadeFuncionarios;  
        System.out.println("M�dia Salarial = " + mediaSalarial);  
  
        System.exit(0);  
    }  
  
}  