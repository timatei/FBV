import javax.swing.JOptionPane;

public class Carro {
	
	// Atributos do Carro
	public String Marca;
	public int ano;
	private int marcha = 0;
	public boolean ligado;
	public int velocidade;
	public boolean freio = true;
	
	
	// Métodos
	
	public void ligar(){
		
		if(this.ligado == false){
		this.ligado = true;
		JOptionPane.showMessageDialog(null, "Carro Ligado");
		
		} else {
		System.out.println("O Carro já esta ligado.");
		}
	
	}
	
	
	public void Acelerar(int velocidade){
		
		if (this.ligado == true){
			if(this.freio == false){
				if(this.marcha == 0){
					JOptionPane.showMessageDialog(null, "Esta em Ponto Morto.");
				} else if(this.marcha == 1){
					if(velocidade < 30){
					this.velocidade = velocidade;
					System.out.println(this.velocidade);
				}
			} else if(this.marcha == 2){
				if(velocidade < 50){
				this.velocidade = velocidade;
				System.out.println(this.velocidade);
			}
		} else if(this.marcha == 3){
			if(velocidade < 80){
			this.velocidade = velocidade;
			System.out.println(this.velocidade);
	}
	}
			}
		}
		}
	public void desligar(){
		
		if(this.ligado ==true){
		this.ligado = false;
		JOptionPane.showMessageDialog(null, "Carro Desligado");
		} else {
			System.out.println("Carro Não Esta Ligado.");
		}
	}
	public void trocarMarcha(){
		this.marcha = this.marcha + 1;
		
	}
}
