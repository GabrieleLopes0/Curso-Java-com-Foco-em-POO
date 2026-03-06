package exercicio_6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        /* 
        //Exercicio 1 
        
        System.out.println("Iniciando programa para exibir números ímpares");
        int x;
        
        System.out.println("Digite um valor inteiro de 1 a 1000:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        
        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        */
        /* 
        //Exercicio 2 
        
        System.out.println("Iniciando programa para contar valores em intervalo");
        int n, valor;
        int dentro = 0, fora = 0;
        
        System.out.println("Digite a quantidade de valores:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o valor " + (i + 1) + ":");
            valor = sc.nextInt();
            
            if (valor >= 10 && valor <= 20) {
                dentro++;
            }
            else {
                fora++;
            }
        }
        
        System.out.println(dentro + " in");
        System.out.println(fora + " out");
        */

        /* 
        //Exercicio 3 - Média Ponderada
        
        System.out.println("Iniciando programa para calcular média ponderada");
        int numCasos;
        double v1, v2, v3, media;
        
        System.out.println("Digite o número de casos de teste:");
        Scanner sc = new Scanner(System.in);
        numCasos = sc.nextInt();
        
        for (int i = 0; i < numCasos; i++) {
            System.out.println("Digite os 3 valores (separados por espaço):");
            v1 = sc.nextDouble();
            v2 = sc.nextDouble();
            v3 = sc.nextDouble();
            
            media = (v1 * 2 + v2 * 3 + v3 * 5) / 10.0;
            
            System.out.printf("%.1f%n", media);
        }
        */

        /* 
        //Exercicio 4 - Divisão com validação
        
        System.out.println("Iniciando programa para calcular divisões");
        int n;
        double numerador, denominador;
        
        System.out.println("Digite a quantidade de pares:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o numerador:");
            numerador = sc.nextDouble();
            System.out.println("Digite o denominador:");
            denominador = sc.nextDouble();
            
            if (denominador == 0) {
                System.out.println("divisao impossivel");
            }
            else {
                double resultado = numerador / denominador;
                System.out.printf("%.1f%n", resultado);
            }
        }
        */

        /* 
        //Exercicio 5 - Cálculo de Fatorial
        
        System.out.println("Iniciando programa para calcular fatorial");
        int num;
        long fatorial = 1;
        
        System.out.println("Digite um número:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        if (num == 0) {
            fatorial = 1;
        }
        else {
            for (int i = 1; i <= num; i++) {
                fatorial *= i;
            }
        }
        
        System.out.println(fatorial);
        */
        /* 
        //Exercicio 6 - Cálculo de Divisores
        
        System.out.println("Iniciando programa para calcular divisores");
        int n;
        
        System.out.println("Digite um número inteiro:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
        */
        /* 
        //Exercicio 7 - Tabela de Quadrados e Cubos
        
        System.out.println("Iniciando programa para mostrar tabela de quadrados e cubos");
        int n;
        
        System.out.println("Digite um número inteiro positivo:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.println(i + " " + quadrado + " " + cubo);
        }
            */
    }
    
}
