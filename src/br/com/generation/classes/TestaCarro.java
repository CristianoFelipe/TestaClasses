package br.com.generation.classes;

public class TestaCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Estanciamento de objeto - criar o objeto
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		c1.modelo = "GLA - 250";
		c1.marca = "Mercedes - Benz";
		c1.ano = 2011;
		c1.velocidade = 0;
		
		c2.velocidade = 10;
		
		System.out.println("Velocidade : " + c1.velocidade);
		System.out.println();
		System.out.println("Velocidade 2 : " + c2.velocidade);
		
		c1.acelerar(50);
		c2.acelerar(150);
		System.out.println("Velocidade acelerando..: " + c1.velocidade);
		System.out.println();
		System.out.println("Velocidade acelerando carro 2..: " + c2.velocidade);
		
		c1.freiar(20);
		c2.freiar(60);
		System.out.println("Velocidade freiada...: " + c1.velocidade);
		System.out.println();
		System.out.println("Velocidade freiada carro2...: " + c2.velocidade);
		
	}

}
