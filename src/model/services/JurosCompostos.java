package model.services;

public class JurosCompostos implements Juros{
	
	@Override
	public void  InterestCalculation (double montante,double vlrAplicado, double taxaJurosAnual, int meses,double vlrinicial) {
		double taxaJurosMensal = Math.pow(1 + taxaJurosAnual, 1.0 / 12) - 1;
		
		for(int i = 1;i<=meses;i++) {
			montante = montante * (1 + taxaJurosMensal) + vlrAplicado;
		} 
		
		System.out.println(montante);
		
	 }
}
