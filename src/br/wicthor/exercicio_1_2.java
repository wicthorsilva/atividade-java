package br.wicthor;

import java.util.Scanner;

public class exercicio_1_2 {
	
	public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = input.nextInt();

        if (numero >= 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
        input.close();
    }
}
