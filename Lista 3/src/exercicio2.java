import javax.swing.JOptionPane;
public class exercicio2 
{ 
    public static void main(String[] args){
        String total=""; 
        int i;          
        for(i=1050;i<=2400;i++){
           if(i%4==0) 
           total+=i+","; 
        }
       
        JOptionPane.showMessageDialog(null,total,"RESULTADO",
                JOptionPane.PLAIN_MESSAGE);
    }
}
