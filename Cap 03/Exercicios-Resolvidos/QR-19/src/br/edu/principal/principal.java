package br.edu.principal;

import java.util.Scanner;

public class principal {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
	
System.out.println("Insira a altura do degrau em metros.");
float altdegrau = sc.nextFloat();
System.out.println("Qual altura você quer atingir subindo esses degraus?");
float altuser = sc.nextFloat();

float numdegraus = (altuser / altdegrau);
		
System.out.println("O número de degraus para subir e alcançar a altura desejada é de " + numdegraus + " degraus");

sc.close();
	}
}