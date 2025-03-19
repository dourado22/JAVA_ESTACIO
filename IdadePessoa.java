import java.util.Scanner;

public class IdadePessoa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = ler.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = ler.nextInt();

        double idadeEmAnos = anoAtual - anoNascimento;

        double idadeEmMeses = idadeEmAnos * 12;

        double idadeEmDias = idadeEmAnos * 365;

        int idadeEmSemanas = idadeEmAnos * 52;

        System.out.println("Idade em anos: " + idadeEmAnos);
        System.out.println("Idade em meses: " + idadeEmMeses);
        System.out.println("Idade em dias: " + idadeEmDias);
        System.out.println("Idade em semanas: " + idadeEmSemanas);
    }
}
