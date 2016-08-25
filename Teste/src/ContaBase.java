
public class ContaBase {
	private double saldo;
	public int conta;
	
	public void sacar(double valor){
		//this.saldo = this.saldo - valor;
		
		if (this.saldo >= valor){
			
		this.saldo -= valor;
		this.juro();
		}
	}
	
	public void depositar(double valor){
		this.saldo+= valor;
	}
	public void verSaldo(){
		this.juro();
		System.out.println("Saldo = " + this.saldo);
			
	}
	
	private void juro(){
		this.saldo -= 1;		
	}
}
