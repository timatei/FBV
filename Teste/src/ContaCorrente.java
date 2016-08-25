
public class ContaCorrente extends Conta {

	// Reescrever o Metodo da Minha classe PAI
	//Overriding
	
	public void sacar(double valor){
		super.sacar(valor);
		this.juro();
	}
	private void juro(){
	this.saldo -= 1;
	}
}
