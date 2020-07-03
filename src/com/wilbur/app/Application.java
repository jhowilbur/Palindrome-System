package com.wilbur.app;

import java.util.Scanner;

public class Application {

	// BEM VINDO A ESTE BREVE TUTORIAL
	// QUALQUER DUVIDA ENTRE EM CONTATO COMIGO

	public static void main(String[] args) {

		// PRIMEIRO OS IMPORTS
		Scanner scanner = new Scanner(System.in);
		StringBuilder inverter = new StringBuilder();

		// SEGUNDO PERGUNTAR E ARMAZENAR A PALAVRA A SER VERIFICADA
		System.out.print("Digite a palvra: ");
		// pega palavra que digitar no console
		String palavra = scanner.next();
		// inverte a palavra digitada
		// e armazena a inversão como tipo String
		String palavraInversa = inverter.append(palavra).reverse().toString();

		System.out.println("Interessante sua palavra: " + palavra + "\num momento Wilbur está verificando...\n");

		// TERCEIRO CONFIRMAR SE É UM PALÍNDROMO IGNORANDO CASE SENSITIVE
		if (palavra.equalsIgnoreCase(palavraInversa)) {
			System.out.println("Wilbur says: " + "\n Sua palavra É um palíndromo" + "\n palavra escolhida: " + palavra
					+ "\n palavra inversa: " + palavraInversa);
		} else {
			System.out.println("Wilbur says: " + "\n Sua palavra NÃO é um palíndromo" + "\n palavra escolhida: "
					+ palavra + "\n palavra inversa: " + palavraInversa);
		}

		// QUARTO - **BONUS**
		// VERIFICAR QUANTAS LETRAS
		// MINUSCULAS E MAIUSCULAS POSSUE NA PALAVRA
		System.out.println(Bonus(palavra));

	}

	//CLASSE BONUS CRIADA COM CARINHO ESPECIAL
	public static String Bonus(String palavra) {
		char[] letras = null;
		letras = palavra.toCharArray();

		int contadorMinuscula = 0;
		int contadorMaiuscula = 0;
		for (int i = 0; i < letras.length; i++) {
			if (Character.isUpperCase(letras[i])) {
				contadorMaiuscula++;
			} else {
				contadorMinuscula++;
			}
		}

		return "total de letras maiusculas: " + contadorMaiuscula +
				"\ntotal de letras minusculas: "+ contadorMinuscula;
	}

}
