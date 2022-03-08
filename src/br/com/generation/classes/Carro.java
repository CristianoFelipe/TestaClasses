package br.com.generation.classes;

public class Carro {

	//Atributos --> variaveis
		String modelo;
		String marca;
		int ano;
		int velocidade;
		
		//Metodos --> acoees --> verbos
		void acelerar(int aceleracao) {
			velocidade += aceleracao;
		}
		void freiar(int reduzir) {
			velocidade -= reduzir;
		}
	}
