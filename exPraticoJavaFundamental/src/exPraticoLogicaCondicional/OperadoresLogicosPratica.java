package exPraticoLogicaCondicional;

public class OperadoresLogicosPratica {

	public static void main(String[] args) {
		
		double salarioMensal = 11893.58D;
		double mediaSalario = 10500D;
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;

		 System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));
		 
		 boolean salarioBaixo = salarioMensal < mediaSalario;
		 boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		 
		 System.out.println((salarioBaixo) && (muitosDependentes));
		 
		 boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		 System.out.println("RecebeAuxilio " + recebeAuxilio);
	}

}
