

import novos.caminhos.gui.TelaEntrada;
import novos.caminhos.gui.TelaSaida;
import novos.caminhos.utilitarios.Calculadora;

public class Principal {

	public static void main(String[] args) {
	
		Calculadora calculadora = new Calculadora();
		TelaSaida telaSaida = new TelaSaida();
		TelaEntrada telaEntrada = new TelaEntrada();
		

		double valor1, valor2, operacao, resultado = 0;
		
		valor1 = telaEntrada.getValor("1");
		valor2 = telaEntrada.getValor("2");
		operacao = telaEntrada.getValor("1 para soma, 2-subtracao ou 0 para sair: ");

		switch ((int)operacao) {

		case 1:
			resultado = calculadora.getSomar(valor1,valor2);
			break;

		case 2:
			resultado = calculadora.getSubtrair(valor1,valor2);
			break;

		case 0:
			break;

		}
		
		telaSaida.show("Resultado: ", resultado);
	}

}
