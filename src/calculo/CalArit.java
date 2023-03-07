package calculo;

import java.util.Scanner;

public class CalArit  {
	public static void main(String[] args) {
		
		Scanner num = new Scanner (System.in);
		
		double numero1,numero2,numero3,media;
		System.out.println("Ingrese las tres calificaciones del parcial: ");
		numero1 = num.nextDouble();
		numero2 = num.nextDouble();
		numero3 = num.nextDouble();
		
		media = (numero1 + numero2 + numero3) / 3;
		
		System.out.println("El resultado de la media es: " + media);

	}
}
