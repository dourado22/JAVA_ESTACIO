import java.util.Scanner;

public class RacaoGatos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o peso do saco de ração (em quilos): ");
        double pesoSacoRacao = ler.nextDouble();

        System.out.print("Digite a quantidade de ração fornecida para cada gato (em gramas): ");
        int quantidadeRacaoPorGato = ler.nextInt();

        double pesoSacoRacaoEmGramas = pesoSacoRacao * 1000;
        int quantidadeDiariaTotal = quantidadeRacaoPorGato * 2;
        int quantidadeTotalCincoDias = quantidadeDiariaTotal * 5;
        double racaoRestante = pesoSacoRacaoEmGramas - quantidadeTotalCincoDias;

        System.out.printf("A quantidade de ração restante após 5 dias é: %.2f gramas\n", racaoRestante);
    }
}
20