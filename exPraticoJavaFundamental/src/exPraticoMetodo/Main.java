package exPraticoMetodo;

public class Main {

	public static void main(String[] args) {

		// calculadora
		System.out.println("Exerc�cio Calculdadora");
		Calculadora.soma(3, 6);
		Calculadora.subtracao(8, 4);
		Calculadora.multiplicacao(5, 8);
		Calculadora.divisao(5, 2);

		//Mensagem 
		System.out.println("Exerc�cio Mensagem");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(14);
		Mensagem.obterMensagem(22);
		
		//Empr�stimo
		System.out.println("Exerc�cio Emprestimo");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		Emprestimo.calcular(1000, 5);

		//Quadrilatero
		System.out.println("Exerc�cio quadril�tero");
		Quadrilatero.area(3);
		Quadrilatero.area(5,5);
		Quadrilatero.area(7, 8, 9);
	}
	
}
