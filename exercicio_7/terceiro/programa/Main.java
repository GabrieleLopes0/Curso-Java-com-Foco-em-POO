package exercicio_7.terceiro.programa;

import java.util.Locale;
import java.util.Scanner;
import exercicio_7.terceiro.entidades.Estudante;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();
        estudante.nome = sc.nextLine();
        estudante.nota1 = sc.nextDouble();
        estudante.nota2 = sc.nextDouble();
        estudante.nota3 = sc.nextDouble();
        System.out.printf("Nota Final: %.2f%n", estudante.notaFinal());
        if (estudante.notaFinal() < 60.0) {
            System.out.println("Reprovado");
            System.out.printf("Faltaram %.2f ponto(s)%n", estudante.PontosFaltantes());
        }
        else {
            System.out.println("Aprovado");
        }
        sc.close();
        } 
}
