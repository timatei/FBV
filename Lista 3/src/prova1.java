
public class prova1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int dia = 2;
int mes = 1;
int ano = 1992;

int x = 0, c=1;
int n = (ano+mes+dia) %10;
System.out.println("N igual a "+n);
x = x+n;
System.out.println("X e Igual a "+x);
if (n<4)
	n = n+5;
//else 
	//n=n+3;
System.out.println("n2 e igual a "+n);
while(c<=2*n) {
	x=x+c;
	if(c<n)
	System.out.println("x2 e igual a "+x);
		c=c+3;
		

		c=c+2;
	
}
System.out.println("C e igual a "+x);
	}

}




