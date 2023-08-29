package br.wicthor;

import java.util.Scanner;

public class exercicio_1_4 {
	
	public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a 1a:");
        double numero = input.nextDouble();
        System.out.println("Digite a 2a:");
        double numero2 = input.nextDouble();
        double media = (numero + numero2) /2;
        if (media >= 6 ) {
            System.out.println("Aprovado" +" " + media);
        } else {
            System.out.println("Reprovado" + " " +media); 
        }
}
}
