package Application;

import model.services.Juros;
import model.services.JurosCompostos;

public class Program {
	public static void main(String[]args) {
		
	 Juros juros = new JurosCompostos();
	juros.InterestCalculation(0, 100, 0.12, 12,0);
	 
	 
	}

}


//valor correto para 12 aa 12 meses é de 1.264,65