package br.com.generation.classes;

public class TestaCelular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Celular c1 = new Celular();
		Celular c2 = new Celular();
		Celular c3 = new Celular();
		
	
		c1.marca = "Samsung";
		c1.modelo = "A70";
		c1.valor = 2.000;
		
		c2.marca = "Motorola";
		c2.modelo = "G20";
		c2.valor = 1.500;
		
		c3.marca = "Iphone";
		c3.modelo = "13";
		c3.valor = 9.000;
		
		
		System.out.println(c1.marca);
		System.out.println(c1.modelo);
		System.out.println(c1.valor);
		
		System.out.println(c2.marca);
		System.out.println(c2.modelo);
		System.out.println(c2.valor);
		
		System.out.println(c3.marca);
		System.out.println(c3.modelo);
		System.out.println(c3.valor);
		
		
	}

}
