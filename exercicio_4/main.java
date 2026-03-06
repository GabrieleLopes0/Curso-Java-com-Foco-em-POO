package exercicio_4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /* 
        //Exercicio 1

        System.out.println("Iniciando programa para verificar se o numero é negativo ou não");
        double numero;
        System.out.println("Digite um numero para ser verificado");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextDouble();
        if (numero < 0 ){
            System.out.println("Esse numero é negativo");
        }
        else{
            System.out.println("Esse numero não é negativo");
        }*/

        /* 
        //Exercicio 2

        System.out.println("Iniciando programa para verificar se o numero é par ou impar");
        double numero;
        System.out.println("Digite um numero para ser verificado");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextDouble();
        if (numero % 2 == 0  ){
            System.out.println("Esse numero é par");
        }
        else{
            System.out.println("Esse numero é impar");
        }*/

        /* 
        //Exercicio 3

        System.out.println("Iniciando programa para verificar se dois numeros são multiplos ou não");
        double n1, n2;
        System.out.println("Digite o primeiro numero:");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextDouble();
        System.out.println("Digite o segundo numero:");
        Scanner sc2 = new Scanner(System.in);
        n2 = sc2.nextDouble();
        if (n1 % n2 == 0 || n2 % n1 == 0  ){
            System.out.println("Os numeros são multiplos");
        }
        else{
            System.out.println("Os numeros não são multiplos");
        }*/


        /* 
        //Exercicio 4

        System.out.println("Iniciando programa para calcular duração do jogo");
        int horaInicial, horaFinal, duracao;
        System.out.println("Digite a hora inicial:");
        Scanner sc = new Scanner(System.in);
        horaInicial = sc.nextInt();
        System.out.println("Digite a hora final:");
        duracao = sc.nextInt();
        horaFinal = duracao;
        
        if (horaFinal > horaInicial) {
            duracao = horaFinal - horaInicial;
        }
        else if (horaFinal < horaInicial) {
            duracao = 24 - horaInicial + horaFinal;
        }
        else {
            duracao = 24;
        }
        
        System.out.println("O jogo durou " + duracao + " hora(s)");
        */

        /* 
        //Exercicio 5

        System.out.println("Iniciando programa para calcular valor da conta");
        int codigo, quantidade;
        double preco = 0, total;
        
        System.out.println("Digite o código do item:");
        Scanner sc = new Scanner(System.in);
        codigo = sc.nextInt();
        System.out.println("Digite a quantidade:");
        quantidade = sc.nextInt();
        
        switch (codigo) {
            case 1:
                preco = 4.00;
                break;
            case 2:
                preco = 4.50;
                break;
            case 3:
                preco = 5.00;
                break;
            case 4:
                preco = 2.00;
                break;
            case 5:
                preco = 1.50;
                break;
        }
        
        total = preco * quantidade;
        System.out.printf("Total: R$ %.2f%n", total);
        */

        /* 
        //Exercicio 6

        System.out.println("Iniciando programa para verificar intervalo");
        double valor;
        
        System.out.println("Digite um valor:");
        Scanner sc = new Scanner(System.in);
        valor = sc.nextDouble();
        
        if (valor >= 0 && valor <= 25) {
            System.out.println("Intervalo [0,25]");
        }
        else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalo (25,50]");
        }
        else if (valor > 50 && valor <= 75) {
            System.out.println("Intervalo (50,75]");
        }
        else if (valor > 75 && valor <= 100) {
            System.out.println("Intervalo (75,100]");
        }
        else {
            System.out.println("Fora de intervalo");
        }
        */

        /* 
        //Exercicio 7

        System.out.println("Iniciando programa para verificar quadrante");
        double x, y;
        
        System.out.println("Digite a coordenada X:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        System.out.println("Digite a coordenada Y:");
        y = sc.nextDouble();
        
        if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if (x == 0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0) {
            System.out.println("Eixo X");
        }
        else if (x > 0 && y > 0) {
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0) {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0) {
            System.out.println("Q4");
        }
        */
        /* 
        //Exercicio 8

        System.out.println("Iniciando programa para calcular imposto de renda");
        double salario, imposto = 0;
        
        System.out.println("Digite o salário:");
        Scanner sc = new Scanner(System.in);
        salario = sc.nextDouble();
        
        if (salario <= 2000) {
            System.out.println("Isento");
        }
        else {
            if (salario > 2000 && salario <= 3000) {
                imposto = (salario - 2000) * 0.08;
            }
            else if (salario > 3000 && salario <= 4500) {
                imposto = (3000 - 2000) * 0.08 + (salario - 3000) * 0.18;
            }
            else if (salario > 4500) {
                imposto = (3000 - 2000) * 0.08 + (4500 - 3000) * 0.18 + (salario - 4500) * 0.28;
            }
            System.out.printf("R$ %.2f%n", imposto);
        }*/
    }
    
}
