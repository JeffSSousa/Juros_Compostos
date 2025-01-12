package Application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.services.ExportXls;
import model.services.Juros;
import model.services.JurosCompostos;

public class Program {
	public static void main(String[]args) {
		
	
	
	//-------------------------------------------------
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner (System.in);
	
	Juros comInterest = new JurosCompostos();
	
	try {
	System.out.print("Digite o valor inicial: ");
	double initialValue = sc.nextDouble();
	System.out.print("Digite o valor que sera aplicado por mes: ");
	double monthlyAmount = sc.nextDouble();
	System.out.print("Digite a taxa de juros a.a: ");
	double annualFee = sc.nextDouble();
	annualFee /= 100; 
	
	System.out.println("meses ou anos ? (m/y)");
	char resp = sc.next().charAt(0);
	int months = 0;
	if(resp == 'm' || resp == 'M') {
	System.out.print("Digite a quantidade de meses: ");
	months = sc.nextInt();
	} 
	else if(resp == 'y' || resp == 'Y'){
	System.out.print("Digite a quantidade de anos: ");
    int year = sc.nextInt();
    months = year * 12;
	}  
	else {
		System.out.println("Resposta Invalida! Use 'm' para meses ou 'y' para anos.");
		sc.close();
		return;
	}
	
    // chamada do calculo juros
	comInterest.InterestCalculation(0, monthlyAmount, annualFee, months, initialValue);
	
	// Após chamar comInterest.InterestCalculation
	String filePath = System.getProperty("user.home") + "/OneDrive/Computador/Desktop/Relatorio_Juros_Compostos.xlsx";;
	ExportXls.exportarRelatorio(((JurosCompostos) comInterest).getRelatorio(), filePath);
	
	 sc.close();
	
	} catch (InputMismatchException e) {
		System.out.println("Erro na Digitação !!");
	}
	
	
	}

}

