package br.com.generation.classes;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		Funcionario f3 = new Funcionario();
		
		f1.nome = "Cristiano";
	    f1.função = "Dev fullstack Jr";
	    f1.salario = 5.500;
	    
	    f2.nome = "José";
	    f2.função = "Analista de Suporte";
	    f2.salario = 3.800;
	    
	    f3.nome = "Alice";
	    f3.função = "Analista de Dados";
	    f3.salario = 5.000;
	    
	    System.out.println(f1.nome);
	    System.out.println(f1.função);
	    System.out.println(f1.salario);
	    
	    System.out.println(f2.nome);
	    System.out.println(f2.função);
	    System.out.println(f2.salario);
		
	    System.out.println(f3.nome);
	    System.out.println(f3.função);
	    System.out.println(f3.salario);
		
		

	}

}
