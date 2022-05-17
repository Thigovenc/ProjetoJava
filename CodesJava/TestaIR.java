public class TestaIR {
	public static void main(String[] args) {

		System.out.println("testando IR");

		double salario = 3500;
		double novoSalario;

		if (salario <= 1903.98) {
			
			System.out.println("Nao ha deducao fiscal");
			System.out.println("Salario:"+ salario);
			
		} else if (salario > 1903.99 && salario <= 2826.65) {
			
			System.out.println("Alíquota Fiscal: 7.5%");
			novoSalario = salario - (salario*0.075);
			System.out.println("Novo salario e: " + novoSalario);
			
		} else if (salario >= 2826.66 && salario <= 3751.05) {
			
			System.out.println("Alíquota Fiscal: 15%");
			novoSalario = salario - (salario*0.15);
			System.out.println("Novo salario e: " + novoSalario);
			
		} else if(salario >= 3751.06 && salario <=4664.68){
			
			System.out.println("Alíquota Fiscal: 22.5%");
			novoSalario = salario - (salario*0.225);
			System.out.println("Novo salario e: " + novoSalario);
			
		}else {
			System.out.println("Alíquota Fiscal: 27.5%");
			novoSalario = salario - (salario*0.275);
			System.out.println("Novo salario e: " + novoSalario);
		}
	}
}
