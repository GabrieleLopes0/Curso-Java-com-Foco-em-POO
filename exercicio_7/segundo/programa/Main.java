package exercicio_7.segundo.programa;

import java.util.Locale;
import java.util.Scanner;

import exercicio_7.segundo.entidades.Funcionario;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario fcn = new Funcionario();
        System.out.print("Digite o nome do funcionário: ");
        fcn.nome = sc.nextLine();
        System.out.print("Digite o salário bruto: ");
        fcn.salarioBruto = sc.nextDouble();
        System.out.print("Desconto: ");
        fcn.desconto = sc.nextDouble();
        System.out.println();
        System.out.println("Informações do funcionario: " + fcn);
        System.out.println();
        System.out.print("Qual a porcentagem do aumento? ");
        double porcentagem = sc.nextDouble();
        fcn.aumentarSalario(porcentagem);
        System.out.println();
        System.out.println("Funcionario atualizado: " + fcn);
        sc.close();
        } 
}
