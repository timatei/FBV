
public class Conta {

	protected double saldo;
	public int conta;
	
	public void sacar(double valor){
		//this.saldo = this.saldo - valor;
		
		if (this.saldo >= valor){
			this.saldo -= valor;
				} else {
					System.out.println("N�o possui saldo.");
				}
	}
	
	public void depositar(double valor){
		this.saldo+= valor;
		if(valor == 100){
			System.out.println("Voc� foi sorteado.");
		}
	}
	public void verSaldo(){
				System.out.println("Saldo = U$" + this.saldo);
			
	}
	
	}
