package telas;
import java.util.Scanner;

public class TelaInputFuncionario {
	
	public Scanner input = new Scanner(System.in);
	public String nome;
	public double salarioBruto;
	
	public void lerFuncionario() {
		System.out.print("Digite o seu nome: ");
		nome = input.nextLine();
		
		System.out.print("Digite o valor do Salário Bruto: ");
		salarioBruto = input.nextDouble();
	}

}
