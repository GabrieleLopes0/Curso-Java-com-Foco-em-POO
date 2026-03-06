package exercicio_5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        /* 
        //Exercicio 1
        
        System.out.println("Iniciando programa para validação de senha");
        int senha;
        int senhaCorreta = 2002;
        
        System.out.println("Digite a senha:");
        Scanner sc = new Scanner(System.in);
        senha = sc.nextInt();
        
        while (senha != senhaCorreta) {
            System.out.println("Senha Invalida");
            System.out.println("Digite a senha:");
            senha = sc.nextInt();
        }
        
        System.out.println("Acesso Permitido");
        */

        /* 
        //Exercicio 2

        System.out.println("Iniciando programa para determinar quadrantes");
        double x, y;
        
        System.out.println("Digite a coordenada X:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        System.out.println("Digite a coordenada Y:");
        y = sc.nextDouble();
        
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
            
            System.out.println("Digite a coordenada X:");
            x = sc.nextDouble();
            System.out.println("Digite a coordenada Y:");
            y = sc.nextDouble();
        }
        */

        //Exercicio 3
        /*
        System.out.println("Iniciando programa para contagem de combustíveis");
        int codigo;
        int alcool = 0, gasolina = 0, diesel = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o código do combustível (1-Álcool, 2-Gasolina, 3-Diesel, 4-Fim):");
        codigo = sc.nextInt();
        
        while (codigo < 1 || codigo > 4) {
            System.out.println("Código inválido! Digite novamente:");
            codigo = sc.nextInt();
        }
        
        while (codigo != 4) {
            if (codigo == 1) {
                alcool++;
            }
            else if (codigo == 2) {
                gasolina++;
            }
            else if (codigo == 3) {
                diesel++;
            }
            
            System.out.println("Digite o código do combustível (1-Álcool, 2-Gasolina, 3-Diesel, 4-Fim):");
            codigo = sc.nextInt();
            
            while (codigo < 1 || codigo > 4) {
                System.out.println("Código inválido! Digite novamente:");
                codigo = sc.nextInt();
            }
        }
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        */
    }
    
}
