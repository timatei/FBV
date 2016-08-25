public class Main {

	
	public static void main(String args[]){
		System.out.println("Hello Guys");
		
		// Instânciar Uma classe => Objeto
		
		/*Carro c4 = new Carro();
		
		c4.ligar();
		
		c4.freio = false;
		
		c4.trocarMarcha();
		
		c4.Acelerar(20);
		
		c4.trocarMarcha();
		
		c4.Acelerar(40);
		
		c4.trocarMarcha();
		
		c4.Acelerar(60);
		
		c4.desligar();
		
		
		
		Carro ix35 = new Carro();
		
		//ix35.desligar();*/
		
		ContaCorrente c = new ContaCorrente();
		c.depositar(100);
		c.sacar(50);
		c.verSaldo();
		
		ContaPoupanca p = new ContaPoupanca();
		p.depositar(100);
		p.sacar(50);
		p.verSaldo();
	}

}