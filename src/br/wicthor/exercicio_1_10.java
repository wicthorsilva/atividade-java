package br.wicthor;

import java.util.Scanner;

public class exercicio_1_10 {
	
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu salario fixo:");
        double salarioFixo = input.nextDouble();
        System.out.println("Digite o valor das vendas feitas:");
        double vendaFeita = input.nextDouble();

        if (vendaFeita <= 1500.0) {
        double comissao = vendaFeita * 0.03;

        double salariototalsc = salarioFixo + comissao;

        System.out.println("Seu salario total foi de: R$" + salariototalsc);
        }
        else {
        double comissao = 1500.0 * 0.03 + (vendaFeita - 1500.0) * 0.05;

        double salariototal = salarioFixo + comissao;

        System.out.println("Seu salario total foi de: R$" + salariototal);
    }
}
}
