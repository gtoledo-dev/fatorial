package fatorial;

public class FatorialLogica {

	public int n;
	public int fatorial = 1;
	public int contador = n;
	
	
	public int fatorial() {
		while (contador >= 1) {
			fatorial *= contador;
			contador--;
		}
		return fatorial;
	}
	
	

	
}
