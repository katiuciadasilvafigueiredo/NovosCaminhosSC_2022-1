import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double mediasmodulos[] = new double[3], 
			   mediasAvs[] = new double[3], 
			   modulos[][] = new double[2][3];

		
		System.out.print("Digite a nota da AV1 no modulo 1: ");
		modulos[0][0] = input.nextDouble();
		
		System.out.print("Digite a nota da AV2 no modulo 1: ");
		modulos[0][1] = input.nextDouble();
		
		System.out.print("Digite a nota da AV3 no modulo 1: ");
		modulos[0][2] = input.nextDouble();

		System.out.print("Digite a nota da AV1 no modulo 2: ");
		modulos[1][0] = input.nextDouble();
		
		System.out.print("Digite a nota da AV2 no modulo 2: ");
		modulos[1][1] = input.nextDouble();
		
		System.out.print("Digite a nota da AV3 no modulo 2: ");
		modulos[1][2] = input.nextDouble();
		
		mediasmodulos[0] = (modulos[0][0] + modulos[0][1] + modulos[0][2])/3;
		mediasmodulos[1] = (modulos[1][0] + modulos[1][1] + modulos[1][2])/3;
		
		mediasmodulos[2] = (mediasmodulos[0] + mediasmodulos[1])/2;
		
		mediasAvs[0] = (modulos[0][0] + modulos[1][0])/2;
		mediasAvs[1] = (modulos[0][1] + modulos[1][1])/2;
		mediasAvs[2] = (modulos[0][2] + modulos[1][2])/2;
		
		System.out.println("Media Modulo 1: " + mediasmodulos[0]);
		System.out.println("Media Modulo 2: " + mediasmodulos[1]);
		System.out.println("Media AV1: " + mediasAvs[0]);
		System.out.println("Media AV2: " + mediasAvs[1]);
		System.out.println("Media AV3: " + mediasAvs[2]);
		System.out.println("Media Geral: " + mediasmodulos[2]);
		
	}

}
