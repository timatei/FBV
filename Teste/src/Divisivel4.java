
import javax.swing.JOptionPane;
public class Divisivel4 
{ 
    public static void main(String[] args)    {
        String total=""; 
        int i;          
        for(i=1050;i<2400;i++)
        {// Inicio do la�o FOR
           if(i%4==0) 
           total+=i+","; 
        }// Fim do la�o FOR
               JOptionPane.showMessageDialog(null,total,"RESULTADO",
                JOptionPane.PLAIN_MESSAGE);
    }
}