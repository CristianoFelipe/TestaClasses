package br.com.generation.classes;


public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
	
	c1.nome = "Gilvan Gama";
	c1.score = "verde";
	c1.idade = 42;
	
	c2.nome = "Tais Costa";
	c2.score = "amarelo";
	c2.idade = 24;
	
	System.out.println(c1.nome);
	System.out.println(c1.score);
	System.out.println(c1.idade);
	System.out.println();
	System.out.println(c2.nome);
	System.out.println(c2.score);
	System.out.println(c2.idade);
	
	}
	

}
