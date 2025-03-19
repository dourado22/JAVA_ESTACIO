import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: R$ ");
        double salario = ler.nextDouble();

        System.out.print("Digite o percentual de aumento: ");
        double percentual = ler.nextDouble();

        double aumento = salario *(percentual / 100);
        double novoSalario = salario + aumento;

        System.out.printf("O novo salário com aumento de 25%% será: R$ %.2f\n", novoSalario);
    }
}