package br.wicthor;

import java.util.Scanner;

public class exercicio_1_1 {
	
	public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = input.nextInt();

        if (numero  > 10) {
            System.out.println("É maior que 10");
        } else {
            System.out.println("É menor que 10");
        }

    }
}
