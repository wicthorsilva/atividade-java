package br.wicthor;

import java.util.Scanner;

public class exercicio_1_3 {
	
	public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Quantas laranjas irá comprar?");
        float numero = input.nextFloat();
        double valor = numero + 0.30 * numero;

        if (numero < 12) {
            System.out.println("irá custar: " + valor);
        } else {
            System.out.println("irá custar: " + numero);
        }
        input.close();
    }
}
