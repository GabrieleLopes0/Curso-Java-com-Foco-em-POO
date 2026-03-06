package exercicio_7.programa;

import java.util.Locale;
import java.util.Scanner;

import exercicio_7.entidades.Retangulo;

public class Main {
public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Retangulo rect = new Retangulo();
    System.out.println("Coloque a altura e largura do retangulo:");
    rect.largura = sc.nextDouble();
    rect.altura = sc.nextDouble();
    System.out.printf("Area = %.2f%n", rect.area());
    System.out.printf("Perimetro = %.2f%n", rect.perimetro());
    System.out.printf("Diagonal = %.2f%n", rect.diagonal());
    sc.close();
}
}
