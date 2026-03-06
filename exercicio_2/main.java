package exercicio_2;

import java.util.Locale;

public class main {
    public static void main(String[] args) {
        /*System.out.println("Iniciando o programa...");
        int idade = 21;
        System.out.println("Minha idade é: " + idade);
        double teste = 10.12345;
        System.out.println("O valor do teste é: " + teste);
        System.out.printf("O valor de teste com casa reduzidas é: %.2f%n", teste);
        Locale.setDefault(Locale.US);
        System.out.printf("O valor de teste com casa reduzidas e ponto é: %.3f%n", teste);
        System.out.println("Concatenando itens como string: " + idade + " anos");
        String nome = "Gabriele";
        System.out.printf("Meu nome é %s e minha idade é %d anos%n", nome, idade);
*/
        String produto1 = "Computador";
        String produto2 = "Mesa de escritório";

        int idade = 30;
        int codigo = 5290;
        char genero = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;

        System.out.println("Produtos:");
        System.out.printf("%s, cujo preço é $ %.2f%n", produto1, preco1);
        System.out.printf("%s, cujo preço é $ %.2f%n", produto2, preco2);
        System.out.println();
        System.out.printf("Registro: %d anos, código %d e gênero: %s%n", idade, codigo, genero);
        System.out.printf("Medida com oito casas decimais: %.8f%n", medida);
        System.out.printf("Arredondado (três casas decimais): %.3f%n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Ponto decimal com três casas decimais: %.3f%n", medida);
    }
    
}
