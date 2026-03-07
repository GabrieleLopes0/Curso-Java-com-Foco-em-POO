package exercicio_7.segundo.entidades;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double desconto;
    public double salarioLiquido() {
        return salarioBruto - desconto;
    }
    public void aumentarSalario(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100.0;
    }
    public String toString() {
        return nome + ", $ " + String.format("%.2f", salarioLiquido());
    }
}