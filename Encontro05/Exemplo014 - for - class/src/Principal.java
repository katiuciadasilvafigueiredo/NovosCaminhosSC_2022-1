import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		double soma=0, mediaTurma;


		for(int i =0; i<2; i++) {
			
			System.out.print("Digite a matricula do aluno: ");
			aluno.matricula = teclado.nextInt();
			System.out.print("Digite o nome do aluno: ");
			aluno.nome = teclado.next();
			System.out.print("Digite o teste do aluno: ");
			aluno.teste = teclado.nextDouble();
			System.out.print("Digite a prova do aluno: ");
			aluno.prova = teclado.nextDouble();
			
			System.out.println(
				"Matricula: " + aluno.matricula +
				" Nome: " + aluno.nome +
				" Média: " + aluno.obterMedia() +
				" Situação: " + aluno.obterSituacao()
			);
			
			soma = soma + aluno.obterMedia();
			
		}
		
		mediaTurma=soma/2;
		
		System.out.println("Média da turma: " + mediaTurma);
		

	}

}
