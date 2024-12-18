package model.entities;

public class Relatorio {
	private Integer year;
	private Integer month;
	private Double totalValue;
	private Double totalInInterest;
	private Double totalInvested;

	public Relatorio(Integer year, Integer month, Double totalValue, Double totalInInterest, Double totalInvested) {
		this.year = year;
		this.month = month;
		this.totalValue = totalValue;
		this.totalInInterest = totalInInterest;
		this.totalInvested = totalInvested;
	}

	public Integer getYear() {
		return year;
	}

	public Integer getMonth() {
		return month;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public Double getTotalInInterest() {
		return totalInInterest;
	}

	public Double getTotalInvested() {
		return totalInvested;
	}

	public String toString() {
		return null;
	}
}
