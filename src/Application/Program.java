package Application;

import java.util.Locale;
import java.util.Scanner;

import model.services.Juros;
import model.services.JurosCompostos;

public class Program {
	public static void main(String[]args) {
		
	//Juros juros = new JurosCompostos();
	//juros.InterestCalculation(0, 100, 0.12, 12,0);
	
	//-------------------------------------------------
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	
	Juros comInterest = new JurosCompostos();
	
	System.out.print("Digite o valor inicial: ");
	double initialValue = sc.nextDouble();
	System.out.print("Digite o valor que sera aplicado por mes: ");
	double monthlyAmount = sc.nextDouble();
	System.out.print("Digite a taxa de juros a.a: ");
	double annualFee = sc.nextInt();
	annualFee /= 100; 
	
	System.out.println("meses ou anos ? (m/y)");
	char resp = sc.next().charAt(0);
	int months = 0;
	if(resp == 'm') {
	months = sc.nextInt();
	} else {
    int year = sc.nextInt();
    months = year * 12;
	}
	
	
	comInterest.InterestCalculation(0, monthlyAmount, annualFee, months, initialValue);
	
	 sc.close();
	}

}


//valor correto para 12 aa 12 meses é de 1.264,65