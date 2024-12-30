package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Relatorio;

public class JurosCompostos implements Juros {
	private Integer month = 0;
	private Integer year = 1;
	private Double totalInvested = 0.0;
	private List<Relatorio> report = new ArrayList<>();

	@Override
	public void InterestCalculation(double amount, double monthlyAmount, double annualFee, int months,double initialValue) {
		double monthlyFee = Math.pow(1 + annualFee, 1.0 / 12) - 1;

		for (int i = 1; i <= months; i++) {

			month++;
			if (month > 12) {
				year++;
				month = 1;
			}

			totalInvested += monthlyAmount;
			amount = amount * (1 + monthlyFee) + monthlyAmount;

			report.add(new Relatorio(year, month, amount, (amount - totalInvested), totalInvested));
		}

		for (Relatorio p : report) {
			System.out.println(p.toString());
			System.out.println();
		}

	}
	
	// Método para acessar a lista de relatórios
    public List<Relatorio> getRelatorio() {
        return report;
    }
}
